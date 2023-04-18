package com.person.details;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
//        Person sahil = Person.newBuilder()
//                .setName("Sahil")
//                .setAge(23)
//                .build();

        Path path = Paths.get("sahil.ser");
//        Files.write(path, sahil.toByteArray());
        byte[] bytes = Files.readAllBytes(path);
        Person readSahil = Person.parseFrom(bytes);

        System.out.println(
                readSahil
        );
    }
}
