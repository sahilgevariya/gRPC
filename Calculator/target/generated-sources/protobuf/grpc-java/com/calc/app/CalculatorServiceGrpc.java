package com.calc.app;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: CalculatorService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doSum",
      requestType = com.calc.app.CalcRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoSumMethod() {
    io.grpc.MethodDescriptor<com.calc.app.CalcRequest, com.calc.app.CalcResponse> getDoSumMethod;
    if ((getDoSumMethod = CalculatorServiceGrpc.getDoSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDoSumMethod = CalculatorServiceGrpc.getDoSumMethod) == null) {
          CalculatorServiceGrpc.getDoSumMethod = getDoSumMethod =
              io.grpc.MethodDescriptor.<com.calc.app.CalcRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("doSum"))
              .build();
        }
      }
    }
    return getDoSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoSubtractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doSubtraction",
      requestType = com.calc.app.CalcRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoSubtractionMethod() {
    io.grpc.MethodDescriptor<com.calc.app.CalcRequest, com.calc.app.CalcResponse> getDoSubtractionMethod;
    if ((getDoSubtractionMethod = CalculatorServiceGrpc.getDoSubtractionMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDoSubtractionMethod = CalculatorServiceGrpc.getDoSubtractionMethod) == null) {
          CalculatorServiceGrpc.getDoSubtractionMethod = getDoSubtractionMethod =
              io.grpc.MethodDescriptor.<com.calc.app.CalcRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doSubtraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("doSubtraction"))
              .build();
        }
      }
    }
    return getDoSubtractionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoMulMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doMul",
      requestType = com.calc.app.CalcRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoMulMethod() {
    io.grpc.MethodDescriptor<com.calc.app.CalcRequest, com.calc.app.CalcResponse> getDoMulMethod;
    if ((getDoMulMethod = CalculatorServiceGrpc.getDoMulMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDoMulMethod = CalculatorServiceGrpc.getDoMulMethod) == null) {
          CalculatorServiceGrpc.getDoMulMethod = getDoMulMethod =
              io.grpc.MethodDescriptor.<com.calc.app.CalcRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doMul"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("doMul"))
              .build();
        }
      }
    }
    return getDoMulMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doDivide",
      requestType = com.calc.app.CalcRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getDoDivideMethod() {
    io.grpc.MethodDescriptor<com.calc.app.CalcRequest, com.calc.app.CalcResponse> getDoDivideMethod;
    if ((getDoDivideMethod = CalculatorServiceGrpc.getDoDivideMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDoDivideMethod = CalculatorServiceGrpc.getDoDivideMethod) == null) {
          CalculatorServiceGrpc.getDoDivideMethod = getDoDivideMethod =
              io.grpc.MethodDescriptor.<com.calc.app.CalcRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doDivide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("doDivide"))
              .build();
        }
      }
    }
    return getDoDivideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getStreamSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamSum",
      requestType = com.calc.app.CalcRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getStreamSumMethod() {
    io.grpc.MethodDescriptor<com.calc.app.CalcRequest, com.calc.app.CalcResponse> getStreamSumMethod;
    if ((getStreamSumMethod = CalculatorServiceGrpc.getStreamSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getStreamSumMethod = CalculatorServiceGrpc.getStreamSumMethod) == null) {
          CalculatorServiceGrpc.getStreamSumMethod = getStreamSumMethod =
              io.grpc.MethodDescriptor.<com.calc.app.CalcRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("streamSum"))
              .build();
        }
      }
    }
    return getStreamSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getTotalSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "totalSum",
      requestType = com.calc.app.CalcRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.calc.app.CalcRequest,
      com.calc.app.CalcResponse> getTotalSumMethod() {
    io.grpc.MethodDescriptor<com.calc.app.CalcRequest, com.calc.app.CalcResponse> getTotalSumMethod;
    if ((getTotalSumMethod = CalculatorServiceGrpc.getTotalSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getTotalSumMethod = CalculatorServiceGrpc.getTotalSumMethod) == null) {
          CalculatorServiceGrpc.getTotalSumMethod = getTotalSumMethod =
              io.grpc.MethodDescriptor.<com.calc.app.CalcRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "totalSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("totalSum"))
              .build();
        }
      }
    }
    return getTotalSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.NumberRequest,
      com.calc.app.CalcResponse> getGetFactorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFactors",
      requestType = com.calc.app.NumberRequest.class,
      responseType = com.calc.app.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.calc.app.NumberRequest,
      com.calc.app.CalcResponse> getGetFactorsMethod() {
    io.grpc.MethodDescriptor<com.calc.app.NumberRequest, com.calc.app.CalcResponse> getGetFactorsMethod;
    if ((getGetFactorsMethod = CalculatorServiceGrpc.getGetFactorsMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGetFactorsMethod = CalculatorServiceGrpc.getGetFactorsMethod) == null) {
          CalculatorServiceGrpc.getGetFactorsMethod = getGetFactorsMethod =
              io.grpc.MethodDescriptor.<com.calc.app.NumberRequest, com.calc.app.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFactors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("getFactors"))
              .build();
        }
      }
    }
    return getGetFactorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.calc.app.TypeRequest,
      com.calc.app.TypeResponse> getGetTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getType",
      requestType = com.calc.app.TypeRequest.class,
      responseType = com.calc.app.TypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.calc.app.TypeRequest,
      com.calc.app.TypeResponse> getGetTypeMethod() {
    io.grpc.MethodDescriptor<com.calc.app.TypeRequest, com.calc.app.TypeResponse> getGetTypeMethod;
    if ((getGetTypeMethod = CalculatorServiceGrpc.getGetTypeMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGetTypeMethod = CalculatorServiceGrpc.getGetTypeMethod) == null) {
          CalculatorServiceGrpc.getGetTypeMethod = getGetTypeMethod =
              io.grpc.MethodDescriptor.<com.calc.app.TypeRequest, com.calc.app.TypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.TypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calc.app.TypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("getType"))
              .build();
        }
      }
    }
    return getGetTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void doSum(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoSumMethod(), responseObserver);
    }

    /**
     */
    public void doSubtraction(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoSubtractionMethod(), responseObserver);
    }

    /**
     */
    public void doMul(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoMulMethod(), responseObserver);
    }

    /**
     */
    public void doDivide(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoDivideMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.calc.app.CalcRequest> streamSum(
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSumMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.calc.app.CalcRequest> totalSum(
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTotalSumMethod(), responseObserver);
    }

    /**
     */
    public void getFactors(com.calc.app.NumberRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFactorsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.calc.app.TypeRequest> getType(
        io.grpc.stub.StreamObserver<com.calc.app.TypeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.calc.app.CalcRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_DO_SUM)))
          .addMethod(
            getDoSubtractionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.calc.app.CalcRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_DO_SUBTRACTION)))
          .addMethod(
            getDoMulMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.calc.app.CalcRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_DO_MUL)))
          .addMethod(
            getDoDivideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.calc.app.CalcRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_DO_DIVIDE)))
          .addMethod(
            getStreamSumMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.calc.app.CalcRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_STREAM_SUM)))
          .addMethod(
            getTotalSumMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.calc.app.CalcRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_TOTAL_SUM)))
          .addMethod(
            getGetFactorsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.calc.app.NumberRequest,
                com.calc.app.CalcResponse>(
                  this, METHODID_GET_FACTORS)))
          .addMethod(
            getGetTypeMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.calc.app.TypeRequest,
                com.calc.app.TypeResponse>(
                  this, METHODID_GET_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void doSum(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doSubtraction(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoSubtractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doMul(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoMulMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doDivide(com.calc.app.CalcRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoDivideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.calc.app.CalcRequest> streamSum(
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSumMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.calc.app.CalcRequest> totalSum(
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getTotalSumMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getFactors(com.calc.app.NumberRequest request,
        io.grpc.stub.StreamObserver<com.calc.app.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetFactorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.calc.app.TypeRequest> getType(
        io.grpc.stub.StreamObserver<com.calc.app.TypeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetTypeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.calc.app.CalcResponse doSum(com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.calc.app.CalcResponse doSubtraction(com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoSubtractionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.calc.app.CalcResponse doMul(com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoMulMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.calc.app.CalcResponse doDivide(com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoDivideMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.calc.app.CalcResponse> getFactors(
        com.calc.app.NumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetFactorsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.calc.app.CalcResponse> doSum(
        com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoSumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.calc.app.CalcResponse> doSubtraction(
        com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoSubtractionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.calc.app.CalcResponse> doMul(
        com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoMulMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.calc.app.CalcResponse> doDivide(
        com.calc.app.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_SUM = 0;
  private static final int METHODID_DO_SUBTRACTION = 1;
  private static final int METHODID_DO_MUL = 2;
  private static final int METHODID_DO_DIVIDE = 3;
  private static final int METHODID_GET_FACTORS = 4;
  private static final int METHODID_STREAM_SUM = 5;
  private static final int METHODID_TOTAL_SUM = 6;
  private static final int METHODID_GET_TYPE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_SUM:
          serviceImpl.doSum((com.calc.app.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
          break;
        case METHODID_DO_SUBTRACTION:
          serviceImpl.doSubtraction((com.calc.app.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
          break;
        case METHODID_DO_MUL:
          serviceImpl.doMul((com.calc.app.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
          break;
        case METHODID_DO_DIVIDE:
          serviceImpl.doDivide((com.calc.app.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
          break;
        case METHODID_GET_FACTORS:
          serviceImpl.getFactors((com.calc.app.NumberRequest) request,
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_SUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamSum(
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
        case METHODID_TOTAL_SUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.totalSum(
              (io.grpc.stub.StreamObserver<com.calc.app.CalcResponse>) responseObserver);
        case METHODID_GET_TYPE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getType(
              (io.grpc.stub.StreamObserver<com.calc.app.TypeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.calc.app.CalculatorServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getDoSumMethod())
              .addMethod(getDoSubtractionMethod())
              .addMethod(getDoMulMethod())
              .addMethod(getDoDivideMethod())
              .addMethod(getStreamSumMethod())
              .addMethod(getTotalSumMethod())
              .addMethod(getGetFactorsMethod())
              .addMethod(getGetTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
