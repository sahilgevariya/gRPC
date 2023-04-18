package com.calc.server;

import com.calc.server.observers.CalculatorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(6565)
                .addService(new CalculatorService())
//                .addService(new Test())
                .build();

        server.start();

        server.awaitTermination();
    }
}
