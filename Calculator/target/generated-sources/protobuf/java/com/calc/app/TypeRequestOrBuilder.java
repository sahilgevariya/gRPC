// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messages.proto

package com.calc.app;

public interface TypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 num = 1;</code>
   * @return Whether the num field is set.
   */
  boolean hasNum();
  /**
   * <code>int32 num = 1;</code>
   * @return The num.
   */
  int getNum();

  /**
   * <code>string name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>float f_num = 3;</code>
   * @return Whether the fNum field is set.
   */
  boolean hasFNum();
  /**
   * <code>float f_num = 3;</code>
   * @return The fNum.
   */
  float getFNum();

  /**
   * <code>.DOB dob = 4;</code>
   * @return Whether the dob field is set.
   */
  boolean hasDob();
  /**
   * <code>.DOB dob = 4;</code>
   * @return The dob.
   */
  com.calc.app.DOB getDob();
  /**
   * <code>.DOB dob = 4;</code>
   */
  com.calc.app.DOBOrBuilder getDobOrBuilder();

  public com.calc.app.TypeRequest.TypeCase getTypeCase();
}
