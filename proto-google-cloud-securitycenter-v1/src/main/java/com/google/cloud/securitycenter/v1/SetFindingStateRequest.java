// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Request message for updating a finding's state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.SetFindingStateRequest}
 */
public final class SetFindingStateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.SetFindingStateRequest)
    SetFindingStateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetFindingStateRequest.newBuilder() to construct.
  private SetFindingStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetFindingStateRequest() {
    name_ = "";
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SetFindingStateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (startTime_ != null) {
                subBuilder = startTime_.toBuilder();
              }
              startTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTime_);
                startTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_SetFindingStateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_SetFindingStateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.SetFindingStateRequest.class,
            com.google.cloud.securitycenter.v1.SetFindingStateRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The relative resource name of the finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456/finding/789".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The relative resource name of the finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/123/sources/456/finding/789".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_;
  /**
   *
   *
   * <pre>
   * The desired State of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * The desired State of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
   */
  public com.google.cloud.securitycenter.v1.Finding.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.securitycenter.v1.Finding.State result =
        com.google.cloud.securitycenter.v1.Finding.State.valueOf(state_);
    return result == null ? com.google.cloud.securitycenter.v1.Finding.State.UNRECOGNIZED : result;
  }

  public static final int START_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * The time at which the updated state takes effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time at which the updated state takes effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * The time at which the updated state takes effect.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (state_ != com.google.cloud.securitycenter.v1.Finding.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (startTime_ != null) {
      output.writeMessage(3, getStartTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (state_ != com.google.cloud.securitycenter.v1.Finding.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, state_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStartTime());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.SetFindingStateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.SetFindingStateRequest other =
        (com.google.cloud.securitycenter.v1.SetFindingStateRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (state_ != other.state_) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.securitycenter.v1.SetFindingStateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for updating a finding's state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.SetFindingStateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.SetFindingStateRequest)
      com.google.cloud.securitycenter.v1.SetFindingStateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_SetFindingStateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_SetFindingStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.SetFindingStateRequest.class,
              com.google.cloud.securitycenter.v1.SetFindingStateRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.SetFindingStateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      state_ = 0;

      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_SetFindingStateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.SetFindingStateRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.SetFindingStateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.SetFindingStateRequest build() {
      com.google.cloud.securitycenter.v1.SetFindingStateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.SetFindingStateRequest buildPartial() {
      com.google.cloud.securitycenter.v1.SetFindingStateRequest result =
          new com.google.cloud.securitycenter.v1.SetFindingStateRequest(this);
      result.name_ = name_;
      result.state_ = state_;
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1.SetFindingStateRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1.SetFindingStateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.SetFindingStateRequest other) {
      if (other == com.google.cloud.securitycenter.v1.SetFindingStateRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
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
      com.google.cloud.securitycenter.v1.SetFindingStateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.securitycenter.v1.SetFindingStateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The relative resource name of the finding. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456/finding/789".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the finding. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456/finding/789".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the finding. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456/finding/789".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the finding. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456/finding/789".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relative resource name of the finding. See:
     * https://cloud.google.com/apis/design/resource_names#relative_resource_name
     * Example:
     * "organizations/123/sources/456/finding/789".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * The desired State of the finding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * The desired State of the finding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired State of the finding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
     */
    public com.google.cloud.securitycenter.v1.Finding.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.securitycenter.v1.Finding.State result =
          com.google.cloud.securitycenter.v1.Finding.State.valueOf(state_);
      return result == null
          ? com.google.cloud.securitycenter.v1.Finding.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The desired State of the finding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
     */
    public Builder setState(com.google.cloud.securitycenter.v1.Finding.State value) {
      if (value == null) {
        throw new NullPointerException();
      }

      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired State of the finding.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Finding.State state = 2;</code>
     */
    public Builder clearState() {

      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
              com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {

      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time at which the updated state takes effect.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.SetFindingStateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.SetFindingStateRequest)
  private static final com.google.cloud.securitycenter.v1.SetFindingStateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.SetFindingStateRequest();
  }

  public static com.google.cloud.securitycenter.v1.SetFindingStateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetFindingStateRequest> PARSER =
      new com.google.protobuf.AbstractParser<SetFindingStateRequest>() {
        @java.lang.Override
        public SetFindingStateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SetFindingStateRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SetFindingStateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetFindingStateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.SetFindingStateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}