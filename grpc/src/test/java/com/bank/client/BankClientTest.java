package com.bank.client;


import com.bank.service.Balance;
import com.bank.service.BalanceCheckRequest;
import com.bank.service.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {

    private BankServiceGrpc.BankServiceBlockingStub blockingStub;
    private BankServiceGrpc.BankServiceStub stub;

    @BeforeAll
    public void setup() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        blockingStub = BankServiceGrpc.newBlockingStub(channel);
        stub = BankServiceGrpc.newStub(channel);
    }

    @Test
    public void balanceTest() {
        BalanceCheckRequest request = BalanceCheckRequest.newBuilder()
                .setAccNo(8)
                .build();

        Balance balance = this.blockingStub.getBalance(request);
        System.out.println(
                "Balance : " + balance.getAmount()
        );
    }
}
