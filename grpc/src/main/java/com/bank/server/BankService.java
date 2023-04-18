package com.bank.server;

import com.bank.service.Balance;
import com.bank.service.BalanceCheckRequest;
import com.bank.service.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {
//        super.getBalance(request, responseObserver);
        int accNo = request.getAccNo();
        Balance balance = Balance.newBuilder().
                setAmount(AccountDB.getBalance(accNo)).build();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }
}
