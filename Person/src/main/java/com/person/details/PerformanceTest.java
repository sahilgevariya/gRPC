package com.person.details;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PerformanceTest {
    public static void main(String[] args) {
        // json
        JPerson person = new JPerson();
        person.setName("sahil");
        person.setAge(23);

        ObjectMapper mapper  = new ObjectMapper();
        Runnable r1 = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                mapper.readValue(bytes, JPerson.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
        
        // protobuf
        Person personP = Person.newBuilder().setName("sahil").setAge(23).build();
        Runnable r2 = () -> {
            try {
                byte[] bytes = personP.toByteArray();
                Person person1 = Person.parseFrom(bytes);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        System.out.println("JSON vs ProtoBuf Serialization vs Deserialization Test");
        for (int i = 0; i < 5; i++) {
            runPerformanceTest(r1, "JSON");
            runPerformanceTest(r2, "ProtoBuf");
            System.out.println();
        }
    }
    
    private static void runPerformanceTest(Runnable r, String methodName){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5_000_000; i++) {
            r.run();
        }
        
        long end = System.currentTimeMillis();
        System.out.println(
                methodName + " : " + (end-start) + " ms"
        );
    }
}
