package com.calc.client;

import com.calc.app.CalcRequest;
import com.calc.app.CalcResponse;

import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class StreamSumResponseObserver implements StreamObserver<CalcResponse> {

    private final CountDownLatch latch;
    private StreamObserver<CalcRequest> requestStreamObserver;

    public StreamSumResponseObserver(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(CalcResponse calcResponse) {
        System.out.println(
                "Answer : " + calcResponse.getAnswer()
        );
//        this.requestStreamObserver.onNext();
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Got error while in CLient "+throwable.toString());
        this.latch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println("All transfers are done!!");
        this.latch.countDown();
    }

    public void setCalcRequestObserver(StreamObserver<CalcRequest> requestStreamObserver) {
        this.requestStreamObserver = requestStreamObserver;
    }
}
