// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package com.person.details;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.EmailCred emailMode = 1;</code>
   * @return Whether the emailMode field is set.
   */
  boolean hasEmailMode();
  /**
   * <code>.EmailCred emailMode = 1;</code>
   * @return The emailMode.
   */
  com.person.details.EmailCred getEmailMode();
  /**
   * <code>.EmailCred emailMode = 1;</code>
   */
  com.person.details.EmailCredOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.PhoneCred phoneMode = 2;</code>
   * @return Whether the phoneMode field is set.
   */
  boolean hasPhoneMode();
  /**
   * <code>.PhoneCred phoneMode = 2;</code>
   * @return The phoneMode.
   */
  com.person.details.PhoneCred getPhoneMode();
  /**
   * <code>.PhoneCred phoneMode = 2;</code>
   */
  com.person.details.PhoneCredOrBuilder getPhoneModeOrBuilder();

  public com.person.details.Credentials.ModeCase getModeCase();
}
