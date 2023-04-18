package com.calc.server.observers;

import com.calc.app.CalcRequest;
import com.calc.app.CalcResponse;
import io.grpc.stub.StreamObserver;

public class StreamSumRequestObserver implements StreamObserver<CalcRequest> {

    private CalculatorService service;
    private StreamObserver<CalcResponse> responseStreamObserver;

    public StreamSumRequestObserver(CalculatorService service, StreamObserver<CalcResponse> responseStreamObserver) {
        this.service = service;
        this.responseStreamObserver = responseStreamObserver;
    }

    @Override
    public void onNext(CalcRequest calcRequest) {
        System.out.println("Sum Request: "+calcRequest);
        CalcResponse response = CalcResponse.newBuilder()
                .setAnswer(
                        this.service.sum(calcRequest.getA(), calcRequest.getB())
                ).build();
//        CalcResponse response = CalcResponse.newBuilder().setAnswer(calcRequest.getA() + calcRequest.getB()).build();
        System.out.println(response);
        this.responseStreamObserver.onNext(response);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Got error while in Server");
    }

    @Override
    public void onCompleted() {
        this.responseStreamObserver.onCompleted();
    }
}
