package com.bidi.test.server;

import io.grpc.Metadata;

public class ServerConstants {
    public static final Metadata.Key<String> TOKEN =
            Metadata.Key.of("client-token",Metadata.ASCII_STRING_MARSHALLER);
}
