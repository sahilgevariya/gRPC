package com.bidi.test.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: data.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BidiServiceGrpc {

  private BidiServiceGrpc() {}

  public static final String SERVICE_NAME = "BidiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MsgReq,
          MsgRes> getBidiMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidiMsg",
      requestType = MsgReq.class,
      responseType = MsgRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<MsgReq,
          MsgRes> getBidiMsgMethod() {
    io.grpc.MethodDescriptor<MsgReq, MsgRes> getBidiMsgMethod;
    if ((getBidiMsgMethod = BidiServiceGrpc.getBidiMsgMethod) == null) {
      synchronized (BidiServiceGrpc.class) {
        if ((getBidiMsgMethod = BidiServiceGrpc.getBidiMsgMethod) == null) {
          BidiServiceGrpc.getBidiMsgMethod = getBidiMsgMethod =
              io.grpc.MethodDescriptor.<MsgReq, MsgRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bidiMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MsgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MsgRes.getDefaultInstance()))
              .setSchemaDescriptor(new BidiServiceMethodDescriptorSupplier("bidiMsg"))
              .build();
        }
      }
    }
    return getBidiMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BidiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BidiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BidiServiceStub>() {
        @java.lang.Override
        public BidiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BidiServiceStub(channel, callOptions);
        }
      };
    return BidiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BidiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BidiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BidiServiceBlockingStub>() {
        @java.lang.Override
        public BidiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BidiServiceBlockingStub(channel, callOptions);
        }
      };
    return BidiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BidiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BidiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BidiServiceFutureStub>() {
        @java.lang.Override
        public BidiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BidiServiceFutureStub(channel, callOptions);
        }
      };
    return BidiServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BidiServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<MsgReq> bidiMsg(
        io.grpc.stub.StreamObserver<MsgRes> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidiMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBidiMsgMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                      MsgReq,
                      MsgRes>(
                  this, METHODID_BIDI_MSG)))
          .build();
    }
  }

  /**
   */
  public static final class BidiServiceStub extends io.grpc.stub.AbstractAsyncStub<BidiServiceStub> {
    private BidiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BidiServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MsgReq> bidiMsg(
        io.grpc.stub.StreamObserver<MsgRes> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidiMsgMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BidiServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BidiServiceBlockingStub> {
    private BidiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BidiServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class BidiServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BidiServiceFutureStub> {
    private BidiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BidiServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BIDI_MSG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BidiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BidiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BIDI_MSG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiMsg(
              (io.grpc.stub.StreamObserver<MsgRes>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BidiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BidiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Data.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BidiService");
    }
  }

  private static final class BidiServiceFileDescriptorSupplier
      extends BidiServiceBaseDescriptorSupplier {
    BidiServiceFileDescriptorSupplier() {}
  }

  private static final class BidiServiceMethodDescriptorSupplier
      extends BidiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BidiServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BidiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BidiServiceFileDescriptorSupplier())
              .addMethod(getBidiMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
