package com.snake.game.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(6566)
                .addService(new GameService())
                .build();

        server.start();

        server.awaitTermination();

    }
}
