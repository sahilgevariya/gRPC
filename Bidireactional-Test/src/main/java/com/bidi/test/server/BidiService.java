package com.bidi.test.server;

import io.grpc.stub.StreamObserver;

public class BidiService extends BidiServiceGrpc.BidiServiceImplBase{
    @Override
    public StreamObserver<MsgReq> bidiMsg(StreamObserver<MsgRes> responseObserver) {
        return new StreamObserver<MsgReq>() {
            @Override
            public void onNext(MsgReq msgReq) {
                responseObserver.onNext(MsgRes.newBuilder()
                        .setResponse("Hello "+msgReq.getName()).build());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error in Server");
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
