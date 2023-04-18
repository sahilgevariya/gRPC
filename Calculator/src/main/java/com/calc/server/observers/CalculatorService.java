package com.calc.server.observers;

import com.calc.app.*;
import com.calc.server.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorService extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public StreamObserver<CalcRequest> totalSum(StreamObserver<CalcResponse> responseObserver) {
        return new StreamObserver<CalcRequest>() {
            private int total_sum = 0;
            @Override
            public void onNext(CalcRequest calcRequest) {
                System.out.println(calcRequest);
                this.total_sum += calcRequest.getA() + calcRequest.getB();
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error : "+throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("Sending Final Response : "+this.total_sum);
                CalcResponse response = CalcResponse.newBuilder().setAnswer(this.total_sum).build();
                responseObserver.onNext(response);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                responseObserver.onCompleted();
            }
        };
    }

    private static final CalculatorService service = new CalculatorService();
    @Override
    public StreamObserver<CalcRequest> streamSum(StreamObserver<CalcResponse> responseObserver) {
        System.out.println("Serving Stream Sum request");
        return new StreamSumRequestObserver(service,responseObserver);
//        return new StreamObserver<CalcRequest>() {
//            @Override
//            public void onNext(CalcRequest calcRequest) {
//                System.out.println("Request : "+calcRequest);
//                CalcResponse response = CalcResponse.newBuilder().setAnswer(calcRequest.getA() + calcRequest.getB()).build();
//                System.out.println("Sending response : "+response);
//                responseObserver.onNext(response);
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//
//            }
//
//            @Override
//            public void onCompleted() {
//                responseObserver.onCompleted();
//            }
//        };
    }

    @Override
    public void getFactors(NumberRequest request, StreamObserver<CalcResponse> responseObserver) {
        List<CalcResponse> calcResponses = this.factors(request.getNumber()).stream()
                .sorted()
                .map(n -> CalcResponse.newBuilder().setAnswer(n).build())
                .collect(Collectors.toList());

        calcResponses.forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<TypeRequest> getType(StreamObserver<TypeResponse> responseObserver) {
        return new StreamObserver<TypeRequest>() {
            private final TypeResponse.Builder builder = TypeResponse.newBuilder();
            @Override
            public void onNext(TypeRequest typeRequest) {
                System.out.println(typeRequest);

                switch (typeRequest.getTypeCase()){
                    case NUM:
                        builder.setType(Types.INTEGER);
                        responseObserver.onNext(builder.build());
                        break;
                    case NAME:
                        builder.setType(Types.STRING);
                        responseObserver.onNext(builder.build());
                        break;
                    case F_NUM:
                        builder.setType(Types.FLOAT);
                        responseObserver.onNext(builder.build());
                        break;
                    case DOB:
                        builder.setType(Types.D_O_B);
                        responseObserver.onNext(builder.build());
                        break;
                    case TYPE_NOT_SET:
                        builder.setType(Types.UNKNOWN);
                        responseObserver.onNext(builder.build());
                        break;
                }
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
    public void doSum(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        CalcResponse answer = CalcResponse.newBuilder().setAnswer(sum(request.getA(),request.getB())).build();
        responseObserver.onNext(answer);
        responseObserver.onCompleted();
    }

    @Override
    public void doSubtraction(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        int sub = request.getA() - request.getB();
        CalcResponse answer = CalcResponse.newBuilder().setAnswer(sub).build();
        responseObserver.onNext(answer);
        responseObserver.onCompleted();
    }

    @Override
    public void doMul(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        int mul = request.getA() * request.getB();
        CalcResponse answer = CalcResponse.newBuilder().setAnswer(mul).build();
        responseObserver.onNext(answer);
        responseObserver.onCompleted();
    }

    @Override
    public void doDivide(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
        float divide =  request.getA() / (float) request.getB();
        CalcResponse answer = CalcResponse.newBuilder().setAnswer(divide).build();
        responseObserver.onNext(answer);
        responseObserver.onCompleted();
    }

    public int sum(int a, int b) {
        return a + b;
    }

    private List<Integer> factors(Integer n) {
        int i = 1;
        ArrayList<Integer> factors = new ArrayList<>();
        while(i <= Math.sqrt(n)){
            if(n % i == 0) {
                if(n/i == i){
                    factors.add(i);
                }else{
                    factors.add( (int) n/i);
                    factors.add(i);
                }
            }
            i++;
        }

        return factors;
    }
}
