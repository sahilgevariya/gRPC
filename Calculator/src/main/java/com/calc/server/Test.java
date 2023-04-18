package com.calc.server;


import com.calc.app.*;
import io.grpc.stub.StreamObserver;

public class Test extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void doSum(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        System.out.println("got request");
        responseObserver.onNext(CalcResponse.newBuilder().setAnswer(request.getA()+request.getB()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void doSubtraction(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        super.doSubtraction(request, responseObserver);
    }

    @Override
    public void doMul(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        super.doMul(request, responseObserver);
    }

    @Override
    public void doDivide(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        super.doDivide(request, responseObserver);
    }

    @Override
    public StreamObserver<CalcRequest> streamSum(StreamObserver<CalcResponse> responseObserver) {
        System.out.println("Serving Stream Sum request");
//        return new StreamSumRequestObserver(service,responseObserver);
        return new StreamObserver<CalcRequest>() {
            @Override
            public void onNext(CalcRequest calcRequest) {
                System.out.println("Request : "+calcRequest);
                CalcResponse response = CalcResponse.newBuilder().setAnswer(calcRequest.getA() + calcRequest.getB()).build();
                System.out.println("Sending response : "+response);
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error : "+throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getFactors(NumberRequest request, StreamObserver<CalcResponse> responseObserver) {
        super.getFactors(request, responseObserver);
    }

    @Override
    public StreamObserver<TypeRequest> getType(StreamObserver<TypeResponse> responseObserver) {
        return super.getType(responseObserver);
    }
}
