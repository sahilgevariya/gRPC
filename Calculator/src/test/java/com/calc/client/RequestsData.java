package com.calc.client;

import com.google.rpc.context.AttributeContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RequestsData {
    public static final Map<Integer, Integer> Requests = new HashMap<>();
    static {
        Requests.put(15,23);
        Requests.put(22,98);
//        Requests = IntStream.rangeClosed(1, 5)
//                .boxed()
//                .collect(
//                        Collectors.toMap(Function.identity(),
//                                (v) -> getRandom()
//                        )
//                );
        System.out.println(Requests);
    }

    private static int getRandom() {
        return ThreadLocalRandom.current().nextInt(1,101);
    }
}
