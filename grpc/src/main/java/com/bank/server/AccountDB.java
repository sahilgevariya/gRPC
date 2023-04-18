package com.bank.server;

import java.util.Map;
import java.util.function.Function;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccountDB {
    private static final Map<Integer, Object> ACCOUNTS = IntStream.range(1,10)
            .boxed()
            .collect(Collectors.toMap(
                    Function.identity(),
                    i -> i * 2)
            );

    public static int getBalance(int accNo) {
        return (int) ACCOUNTS.get(accNo);
    }

    public static Integer addBalance(int accNo, int amt) {
        return (Integer) ACCOUNTS.computeIfPresent(accNo, (k, v) -> (int)v + amt);
    }

    public static Integer deductBalance(int accNo, int amt) {
        return (Integer) ACCOUNTS.computeIfPresent(accNo, (k, v) -> (int) v - amt);
    }
}
