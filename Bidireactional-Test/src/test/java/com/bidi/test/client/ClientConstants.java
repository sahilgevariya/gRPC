package com.bidi.test.client;

import io.grpc.Metadata;

public class ClientConstants {
    private static final Metadata METADATA = new Metadata();

    static {
        METADATA.put(
                Metadata.Key.of(
                        "client-token",
                        Metadata.ASCII_STRING_MARSHALLER),
                        "client-secret1"
        );
    }

    public static Metadata getClientToken() {
        return METADATA;
    }
}
