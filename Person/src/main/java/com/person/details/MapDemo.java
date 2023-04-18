package com.person.details;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {


        Car audi = Car.newBuilder()
                .setModel("Audi")
                .setYear(2020)
                .build();

        Car hundai = Car.newBuilder()
                .setModel("Hundai")
                .setYear(2018)
                .build();

        Map<Integer, Car> maps = new HashMap<>();
        maps.put(2020, audi);
        maps.put(2018, hundai);

        Dealer build = Dealer.newBuilder()
//                .putModel(2020,audi).putModel(2018, hundai)
                .putAllModel(maps)
                .build();

        System.out.println(
                build
        );

    }
}
