package com.bidi.test.server;

import io.grpc.*;

import java.util.Objects;

public class AuthInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        String token = metadata.get(ServerConstants.TOKEN);
        if(this.validate(token)){
            System.out.println("Token Accepted");
            return serverCallHandler.startCall(serverCall,metadata);
        }else{
            System.out.println("Token Rejected");
            Status status = Status.UNAUTHENTICATED.withDescription("Invalid Token");
            serverCall.close(status,metadata);
        }
        System.out.println("Returning empty Listener");
        return new ServerCall.Listener<ReqT>() {};
    }

    private boolean validate(String token){
        return Objects.nonNull(token) && token.equals("client-secret");
    }
}
