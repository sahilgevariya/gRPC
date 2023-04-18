package com.person.details;

public class OneOfDemo {
    public static void main(String[] args) {
        EmailCred emailCred = EmailCred.newBuilder()
                .setEmail("xyz@gmail.com")
                .setPassword("xyz")
                .build();

        PhoneCred phoneCred = PhoneCred.newBuilder()
                .setNumber(956845624)
                .setCode(5694)
                .build();

        Credentials cred = Credentials.newBuilder()
                .setEmailMode(emailCred)          // If we set more than one then
                .setPhoneMode(phoneCred)          // it'll apply latest one
                .build();

        login(cred);
    }

    private static void login(Credentials cred) {

        switch(cred.getModeCase()) {
            case EMAILMODE:
                System.out.println("Got Email Credentials");
                break;
            case PHONEMODE:
                System.out.println("Got Phone Credentials");
                break;
            case MODE_NOT_SET:
                System.out.println("Invalid Credentials");
        }
    }
}
