package com.bidi.test.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(6565)
                .intercept(new AuthInterceptor())
                .addService(new BidiService()).build().start();
        server.awaitTermination();
    }
}
