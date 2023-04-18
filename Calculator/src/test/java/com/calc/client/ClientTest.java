package com.calc.client;

import com.calc.app.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClientTest {
    private CalculatorServiceGrpc.CalculatorServiceStub calculatorServiceStub;
    private CalculatorServiceGrpc.CalculatorServiceBlockingStub stub;

    @BeforeAll
    public void setup() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        this.calculatorServiceStub = CalculatorServiceGrpc.newStub(channel);
        this.stub = CalculatorServiceGrpc.newBlockingStub(channel);
    }

    @Test
    public void StreamSumTest() throws InterruptedException {
        StreamObserver<CalcResponse> responseStreamObserver = new StreamObserver<CalcResponse>() {

            @Override
            public void onNext(CalcResponse calcResponse) {
                System.out.println(
                        "Sum : "+ calcResponse.getAnswer()
                );
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error");
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished all request");
            }
        };

        StreamObserver<CalcRequest> calcRequestStreamObserver = this.calculatorServiceStub.streamSum(responseStreamObserver);
        for (int i = 1; i < 3; i++) {
            calcRequestStreamObserver.onNext(CalcRequest.newBuilder().setA(i).setB(i*5).build());
            Thread.sleep(1000);
        }
//        calcRequestStreamObserver.onNext(CalcRequest.newBuilder().setA(15).setB(10).build());
//        calcRequestStreamObserver.onNext(CalcRequest.newBuilder().setA(25).setB(11).build());
//        CountDownLatch latch = new CountDownLatch(1);
//        StreamSumResponseObserver streamSumResponseObserver = new StreamSumResponseObserver(latch);
//        StreamObserver<CalcRequest> requestStreamObserver = this.calculatorServiceStub.streamSum(streamSumResponseObserver);

//        RequestsData.Requests.forEach((k,v) -> {
//            CalcRequest request = CalcRequest.newBuilder().setA(k).setB(v).build();
//            calcRequestStreamObserver.onNext(request);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        latch.await();
        calcRequestStreamObserver.onCompleted();
    }

    @Test
    public void testDoSum(){
        CalcRequest req = CalcRequest.newBuilder().setA(10).setB(15).build();
        CalcResponse response = this.stub.doSum(req);
        System.out.println(response);
    }

    @Test
    public void testTotalSum() {
        StreamObserver<CalcResponse> calcResponseStreamObserver = new StreamObserver<CalcResponse>() {

            @Override
            public void onNext(CalcResponse calcResponse) {
                System.out.println("Final total is : " + calcResponse.getAnswer());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Got error : "+throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished all requests");
            }
        };
        StreamObserver<CalcRequest> calcRequestStreamObserver = this.calculatorServiceStub.totalSum(calcResponseStreamObserver);

        RequestsData.Requests.forEach((k,v) -> {
            CalcRequest request = CalcRequest.newBuilder().setA(k).setB(v).build();
            calcRequestStreamObserver.onNext(request);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        calcRequestStreamObserver.onCompleted();
    }

    @Test
    public void testType() throws InterruptedException {
        Integer num = 15;
        String name = "Sahil";
        Float percentage = 96.7f;
        DOB dob = DOB.newBuilder().setDay(20).setMonth(8).setYear(2022).build();

        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(num,name,percentage,dob));
        TypeRequest.Builder builder = TypeRequest.newBuilder();

        StreamObserver<TypeResponse> typeResponseStreamObserver = new StreamObserver<TypeResponse>() {

            @Override
            public void onNext(TypeResponse typeResponse) {
                System.out.println(
                        "Type : " + typeResponse.getType()
                );
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error : "+throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished all requests");
            }
        };
        StreamObserver<TypeRequest> typeRequestStreamObserver = this.calculatorServiceStub.getType(typeResponseStreamObserver);

        for(Object obj : objects){
            if (obj instanceof Integer){
                builder.setNum((Integer) obj);
                typeRequestStreamObserver.onNext(builder.build());
            } else if (obj instanceof String) {
                builder.setName((String) obj);
                typeRequestStreamObserver.onNext(builder.build());
            } else if (obj instanceof Float) {
                builder.setFNum((Float) obj);
                typeRequestStreamObserver.onNext(builder.build());
            } else if (obj instanceof DOB) {
                builder.setDob((DOB) obj);
                typeRequestStreamObserver.onNext(builder.build());
            }
            Thread.sleep(500);
        }
        typeRequestStreamObserver.onNext(builder.clearType().build());

        typeRequestStreamObserver.onCompleted();
    }
}
