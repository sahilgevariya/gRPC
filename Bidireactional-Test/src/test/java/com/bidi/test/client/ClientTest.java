package com.bidi.test.client;

import com.bidi.test.server.BidiService;
import com.bidi.test.server.BidiServiceGrpc;
import com.bidi.test.server.MsgReq;
import com.bidi.test.server.MsgRes;
import io.grpc.Context;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClientTest {
    private BidiServiceGrpc.BidiServiceStub stub;
    private BidiServiceGrpc.BidiServiceBlockingStub blockingStub;

    @BeforeAll
    public void setup(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .intercept(MetadataUtils.newAttachHeadersInterceptor(ClientConstants.getClientToken()))
                .usePlaintext()
                .build();

        this.blockingStub = BidiServiceGrpc.newBlockingStub(channel);
        this.stub = BidiServiceGrpc.newStub(channel);
    }

    @Test
    public void testBidi() {
        StreamObserver<MsgRes> responseObserver = new StreamObserver<MsgRes>() {

            @Override
            public void onNext(MsgRes msgRes) {
                System.out.println(
                        msgRes.getResponse()
                );
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Finished all");
            }
        };

        try {
            StreamObserver<MsgReq> msgReqObserver = this.stub.bidiMsg(responseObserver);

            if(!Context.current().isCancelled()) {
                ArrayList<String> names = new ArrayList<>();
                names.add("Sahil");
                names.add("Sneha");

                try {
                    for (String name : names) {
                        MsgReq req = MsgReq.newBuilder().setName(name).build();
                        msgReqObserver.onNext(req);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    msgReqObserver.onError(e);
                    //            throw e;
                }
                msgReqObserver.onCompleted();
            } else {
                System.out.println("Server goes down");
            }
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }
}
