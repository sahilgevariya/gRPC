// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.person.details;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.Address address = 3;</code>
   * @return The address.
   */
  com.person.details.Address getAddress();
  /**
   * <code>.Address address = 3;</code>
   */
  com.person.details.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .Car car = 4;</code>
   */
  java.util.List<com.person.details.Car> 
      getCarList();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  com.person.details.Car getCar(int index);
  /**
   * <code>repeated .Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  java.util.List<? extends com.person.details.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  com.person.details.CarOrBuilder getCarOrBuilder(
      int index);
}