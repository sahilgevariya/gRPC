package com.snack.game.client;

import com.snake.game.server.Die;
import com.snake.game.server.GameServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameClientTest {

    private GameServiceGrpc.GameServiceStub gameServiceStub;

    @BeforeAll
    public void setup() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6566)
                .usePlaintext()
                .build();

        this.gameServiceStub = GameServiceGrpc.newStub(channel);
    }

    @Test
    public void clientGame() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        GameStateStreamingResponse gameStateStreamingResponse = new GameStateStreamingResponse(countDownLatch);

        StreamObserver<Die> dieStreamObserver = this.gameServiceStub.roll(gameStateStreamingResponse);
        gameStateStreamingResponse.setDieStreamObserver(dieStreamObserver);
        gameStateStreamingResponse.roll();
        countDownLatch.await();
    }

















}
