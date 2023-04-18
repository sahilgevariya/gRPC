package com.person.details;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        Address surat = Address.newBuilder()
                .setPincode(395010)
                .setCity("Surat")
                .build();

        Car audi = Car.newBuilder()
                .setModel("Audi")
                .setYear(2020)
                .build();

        Car hundai = Car.newBuilder()
                .setModel("Hundai")
                .setYear(2018)
                .build();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(hundai);

        Person sahil = Person.newBuilder()
                .setName("Sahil")
                .setAge(23)
                .setAddress(surat)
                .addAllCar(cars)
//                .addCar(audi).addCar(hundai)
                .build();

        System.out.println(
                sahil
        );


    }
}
