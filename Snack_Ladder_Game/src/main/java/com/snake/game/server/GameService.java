package com.snake.game.server;

import io.grpc.stub.StreamObserver;

public class GameService extends GameServiceGrpc.GameServiceImplBase {
    @Override
    public StreamObserver<Die> roll(StreamObserver<GameState> responseObserver) {
        Player client = Player.newBuilder()
                .setName("Human")
                .setPosition(0)
                .build();

        Player server = Player.newBuilder()
                .setName("Computer")
                .setPosition(0)
                .build();


        return new DieStreamingRequest(server, client, responseObserver);
    }
}
