// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messages.proto

package com.calc.app;

/**
 * Protobuf type {@code TypeRequest}
 */
public final class TypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TypeRequest)
    TypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TypeRequest.newBuilder() to construct.
  private TypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TypeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TypeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TypeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            type_ = input.readInt32();
            typeCase_ = 1;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            typeCase_ = 2;
            type_ = s;
            break;
          }
          case 29: {
            type_ = input.readFloat();
            typeCase_ = 3;
            break;
          }
          case 34: {
            com.calc.app.DOB.Builder subBuilder = null;
            if (typeCase_ == 4) {
              subBuilder = ((com.calc.app.DOB) type_).toBuilder();
            }
            type_ =
                input.readMessage(com.calc.app.DOB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.calc.app.DOB) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 4;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.calc.app.Messages.internal_static_TypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.calc.app.Messages.internal_static_TypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.calc.app.TypeRequest.class, com.calc.app.TypeRequest.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    NUM(1),
    NAME(2),
    F_NUM(3),
    DOB(4),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return NUM;
        case 2: return NAME;
        case 3: return F_NUM;
        case 4: return DOB;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int NUM_FIELD_NUMBER = 1;
  /**
   * <code>int32 num = 1;</code>
   * @return Whether the num field is set.
   */
  @java.lang.Override
  public boolean hasNum() {
    return typeCase_ == 1;
  }
  /**
   * <code>int32 num = 1;</code>
   * @return The num.
   */
  @java.lang.Override
  public int getNum() {
    if (typeCase_ == 1) {
      return (java.lang.Integer) type_;
    }
    return 0;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  /**
   * <code>string name = 2;</code>
   * @return Whether the name field is set.
   */
  public boolean hasName() {
    return typeCase_ == 2;
  }
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = "";
    if (typeCase_ == 2) {
      ref = type_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (typeCase_ == 2) {
        type_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = "";
    if (typeCase_ == 2) {
      ref = type_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (typeCase_ == 2) {
        type_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int F_NUM_FIELD_NUMBER = 3;
  /**
   * <code>float f_num = 3;</code>
   * @return Whether the fNum field is set.
   */
  @java.lang.Override
  public boolean hasFNum() {
    return typeCase_ == 3;
  }
  /**
   * <code>float f_num = 3;</code>
   * @return The fNum.
   */
  @java.lang.Override
  public float getFNum() {
    if (typeCase_ == 3) {
      return (java.lang.Float) type_;
    }
    return 0F;
  }

  public static final int DOB_FIELD_NUMBER = 4;
  /**
   * <code>.DOB dob = 4;</code>
   * @return Whether the dob field is set.
   */
  @java.lang.Override
  public boolean hasDob() {
    return typeCase_ == 4;
  }
  /**
   * <code>.DOB dob = 4;</code>
   * @return The dob.
   */
  @java.lang.Override
  public com.calc.app.DOB getDob() {
    if (typeCase_ == 4) {
       return (com.calc.app.DOB) type_;
    }
    return com.calc.app.DOB.getDefaultInstance();
  }
  /**
   * <code>.DOB dob = 4;</code>
   */
  @java.lang.Override
  public com.calc.app.DOBOrBuilder getDobOrBuilder() {
    if (typeCase_ == 4) {
       return (com.calc.app.DOB) type_;
    }
    return com.calc.app.DOB.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (typeCase_ == 1) {
      output.writeInt32(
          1, (int)((java.lang.Integer) type_));
    }
    if (typeCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (typeCase_ == 3) {
      output.writeFloat(
          3, (float)((java.lang.Float) type_));
    }
    if (typeCase_ == 4) {
      output.writeMessage(4, (com.calc.app.DOB) type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            1, (int)((java.lang.Integer) type_));
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            3, (float)((java.lang.Float) type_));
    }
    if (typeCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (com.calc.app.DOB) type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.calc.app.TypeRequest)) {
      return super.equals(obj);
    }
    com.calc.app.TypeRequest other = (com.calc.app.TypeRequest) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (getNum()
            != other.getNum()) return false;
        break;
      case 2:
        if (!getName()
            .equals(other.getName())) return false;
        break;
      case 3:
        if (java.lang.Float.floatToIntBits(getFNum())
            != java.lang.Float.floatToIntBits(
                other.getFNum())) return false;
        break;
      case 4:
        if (!getDob()
            .equals(other.getDob())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + NUM_FIELD_NUMBER;
        hash = (53 * hash) + getNum();
        break;
      case 2:
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        break;
      case 3:
        hash = (37 * hash) + F_NUM_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getFNum());
        break;
      case 4:
        hash = (37 * hash) + DOB_FIELD_NUMBER;
        hash = (53 * hash) + getDob().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.calc.app.TypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.calc.app.TypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.calc.app.TypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.calc.app.TypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.calc.app.TypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.calc.app.TypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.calc.app.TypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.calc.app.TypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.calc.app.TypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.calc.app.TypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.calc.app.TypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.calc.app.TypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.calc.app.TypeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TypeRequest)
      com.calc.app.TypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.calc.app.Messages.internal_static_TypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.calc.app.Messages.internal_static_TypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.calc.app.TypeRequest.class, com.calc.app.TypeRequest.Builder.class);
    }

    // Construct using com.calc.app.TypeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.calc.app.Messages.internal_static_TypeRequest_descriptor;
    }

    @java.lang.Override
    public com.calc.app.TypeRequest getDefaultInstanceForType() {
      return com.calc.app.TypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.calc.app.TypeRequest build() {
      com.calc.app.TypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.calc.app.TypeRequest buildPartial() {
      com.calc.app.TypeRequest result = new com.calc.app.TypeRequest(this);
      if (typeCase_ == 1) {
        result.type_ = type_;
      }
      if (typeCase_ == 2) {
        result.type_ = type_;
      }
      if (typeCase_ == 3) {
        result.type_ = type_;
      }
      if (typeCase_ == 4) {
        if (dobBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = dobBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.calc.app.TypeRequest) {
        return mergeFrom((com.calc.app.TypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.calc.app.TypeRequest other) {
      if (other == com.calc.app.TypeRequest.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case NUM: {
          setNum(other.getNum());
          break;
        }
        case NAME: {
          typeCase_ = 2;
          type_ = other.type_;
          onChanged();
          break;
        }
        case F_NUM: {
          setFNum(other.getFNum());
          break;
        }
        case DOB: {
          mergeDob(other.getDob());
          break;
        }
        case TYPE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.calc.app.TypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.calc.app.TypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>int32 num = 1;</code>
     * @return Whether the num field is set.
     */
    public boolean hasNum() {
      return typeCase_ == 1;
    }
    /**
     * <code>int32 num = 1;</code>
     * @return The num.
     */
    public int getNum() {
      if (typeCase_ == 1) {
        return (java.lang.Integer) type_;
      }
      return 0;
    }
    /**
     * <code>int32 num = 1;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(int value) {
      typeCase_ = 1;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      if (typeCase_ == 1) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string name = 2;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return typeCase_ == 2;
    }
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = "";
      if (typeCase_ == 2) {
        ref = type_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (typeCase_ == 2) {
          type_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = "";
      if (typeCase_ == 2) {
        ref = type_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (typeCase_ == 2) {
          type_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  typeCase_ = 2;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      if (typeCase_ == 2) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      typeCase_ = 2;
      type_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>float f_num = 3;</code>
     * @return Whether the fNum field is set.
     */
    public boolean hasFNum() {
      return typeCase_ == 3;
    }
    /**
     * <code>float f_num = 3;</code>
     * @return The fNum.
     */
    public float getFNum() {
      if (typeCase_ == 3) {
        return (java.lang.Float) type_;
      }
      return 0F;
    }
    /**
     * <code>float f_num = 3;</code>
     * @param value The fNum to set.
     * @return This builder for chaining.
     */
    public Builder setFNum(float value) {
      typeCase_ = 3;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float f_num = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFNum() {
      if (typeCase_ == 3) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.calc.app.DOB, com.calc.app.DOB.Builder, com.calc.app.DOBOrBuilder> dobBuilder_;
    /**
     * <code>.DOB dob = 4;</code>
     * @return Whether the dob field is set.
     */
    @java.lang.Override
    public boolean hasDob() {
      return typeCase_ == 4;
    }
    /**
     * <code>.DOB dob = 4;</code>
     * @return The dob.
     */
    @java.lang.Override
    public com.calc.app.DOB getDob() {
      if (dobBuilder_ == null) {
        if (typeCase_ == 4) {
          return (com.calc.app.DOB) type_;
        }
        return com.calc.app.DOB.getDefaultInstance();
      } else {
        if (typeCase_ == 4) {
          return dobBuilder_.getMessage();
        }
        return com.calc.app.DOB.getDefaultInstance();
      }
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    public Builder setDob(com.calc.app.DOB value) {
      if (dobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        dobBuilder_.setMessage(value);
      }
      typeCase_ = 4;
      return this;
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    public Builder setDob(
        com.calc.app.DOB.Builder builderForValue) {
      if (dobBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        dobBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 4;
      return this;
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    public Builder mergeDob(com.calc.app.DOB value) {
      if (dobBuilder_ == null) {
        if (typeCase_ == 4 &&
            type_ != com.calc.app.DOB.getDefaultInstance()) {
          type_ = com.calc.app.DOB.newBuilder((com.calc.app.DOB) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 4) {
          dobBuilder_.mergeFrom(value);
        }
        dobBuilder_.setMessage(value);
      }
      typeCase_ = 4;
      return this;
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    public Builder clearDob() {
      if (dobBuilder_ == null) {
        if (typeCase_ == 4) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 4) {
          typeCase_ = 0;
          type_ = null;
        }
        dobBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    public com.calc.app.DOB.Builder getDobBuilder() {
      return getDobFieldBuilder().getBuilder();
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    @java.lang.Override
    public com.calc.app.DOBOrBuilder getDobOrBuilder() {
      if ((typeCase_ == 4) && (dobBuilder_ != null)) {
        return dobBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 4) {
          return (com.calc.app.DOB) type_;
        }
        return com.calc.app.DOB.getDefaultInstance();
      }
    }
    /**
     * <code>.DOB dob = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.calc.app.DOB, com.calc.app.DOB.Builder, com.calc.app.DOBOrBuilder> 
        getDobFieldBuilder() {
      if (dobBuilder_ == null) {
        if (!(typeCase_ == 4)) {
          type_ = com.calc.app.DOB.getDefaultInstance();
        }
        dobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.calc.app.DOB, com.calc.app.DOB.Builder, com.calc.app.DOBOrBuilder>(
                (com.calc.app.DOB) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 4;
      onChanged();;
      return dobBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TypeRequest)
  }

  // @@protoc_insertion_point(class_scope:TypeRequest)
  private static final com.calc.app.TypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.calc.app.TypeRequest();
  }

  public static com.calc.app.TypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<TypeRequest>() {
    @java.lang.Override
    public TypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TypeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.calc.app.TypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
