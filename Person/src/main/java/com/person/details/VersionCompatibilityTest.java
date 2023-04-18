package com.person.details;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityTest {
    public static void main(String[] args) throws IOException {
//        Television sony = Television.newBuilder()
//                .setBrand("Sony")
//                .setYear(2015)
//                .build();

//        Television lg = Television.newBuilder()
//                .setBrand("LG")
//                .setModel(2012)
//                .setType(Type.UHD)
//                .build();

        // First save the binary of television object, and then change v1 -> v2
        // Now try to read that and parse -> it'll work and any new added field have
        // its default values... i.e, .getType() [new added in v2]

        // v2 -> v1 also work fine (non-breaking changes)

        // Serialize
        Path path = Paths.get("tv_v1");
        Path path2 = Paths.get("tv_v2");
//        Files.write(path2, lg.toByteArray());

        // Deserialize
        byte[] bytes = Files.readAllBytes(path2);
        System.out.println(
                Television.parseFrom(bytes)
        );
    }
}
