package com.snack.game.client;

import com.google.common.util.concurrent.Uninterruptibles;
import com.snake.game.server.Die;
import com.snake.game.server.GameState;
import com.snake.game.server.Player;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class GameStateStreamingResponse implements StreamObserver<GameState> {
    private StreamObserver<Die> dieStreamObserver;
    private CountDownLatch latch;

    public GameStateStreamingResponse(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(GameState gameState) {
        List<Player> playerList = gameState.getPlayerList();

        // Print positions of players
        playerList.forEach(player -> System.out.println(player.getName()+" : "+player.getPosition()));

        AtomicReference<Player> winner = new AtomicReference<>(Player.newBuilder().build());
        boolean reachedGoal = playerList.stream()
                .anyMatch(player -> {
                    if (player.getPosition() == 100) {
                        winner.set(player);
                        return true;
                    }
                    return false;
                });
        if (reachedGoal) {
            System.err.println("Game Over !!!");
            System.out.println("********* Winner := "+winner.get().getName()+" **********");
            this.dieStreamObserver.onCompleted();
            return;
        } else {
//            Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
            this.roll();
        }
        System.out.println("--------------");

    }

    @Override
    public void onError(Throwable throwable) {
        this.latch.countDown();
    }

    @Override
    public void onCompleted() {
        this.latch.countDown();
    }

    public void setDieStreamObserver(StreamObserver<Die> dieStreamObserver){
        this.dieStreamObserver = dieStreamObserver;
    }

    public void roll() {
        int dieVal = ThreadLocalRandom.current().nextInt(1,7);
        Die die = Die.newBuilder().setValue(dieVal).build();
        this.dieStreamObserver.onNext(die);
    }
}
