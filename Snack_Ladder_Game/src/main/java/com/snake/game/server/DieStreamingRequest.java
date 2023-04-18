package com.snake.game.server;

import io.grpc.stub.StreamObserver;

import java.util.concurrent.ThreadLocalRandom;

public class DieStreamingRequest implements StreamObserver<Die> {
    private Player server;
    private Player client;
    private StreamObserver<GameState> gameStateStreamObserver;

    public DieStreamingRequest(Player server, Player client, StreamObserver<GameState> gameStateStreamObserver) {
        this.server = server;
        this.client = client;
        this.gameStateStreamObserver = gameStateStreamObserver;
    }

    @Override
    public void onNext(Die die) {
        this.client = this.getNewPlayerPosition(this.client , die.getValue());
        if (this.client.getPosition() != 100) {
            this.server = this.getNewPlayerPosition(
                    this.server,
                    ThreadLocalRandom
                            .current()
                            .nextInt(1,7)
            );
        }

        this.gameStateStreamObserver.onNext(this.getGameState());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        this.gameStateStreamObserver.onCompleted();
    }

    private GameState getGameState() {
        return GameState.newBuilder().addPlayer(this.client).addPlayer(this.server).build();
    }
    private Player getNewPlayerPosition(Player player, int dieValue) {
        int newPos = player.getPosition() + dieValue;
        newPos = Snack_Ladder_Map.getNextPosition(newPos);

        if (newPos <= 100) {
            player = player.toBuilder()
                    .setPosition(newPos)
                    .build();
        }

        return player;
    }
}





















