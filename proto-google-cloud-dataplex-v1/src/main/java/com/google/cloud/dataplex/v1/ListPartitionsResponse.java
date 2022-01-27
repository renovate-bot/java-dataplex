/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * List metadata partitions response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.ListPartitionsResponse}
 */
public final class ListPartitionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.ListPartitionsResponse)
    ListPartitionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPartitionsResponse.newBuilder() to construct.
  private ListPartitionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPartitionsResponse() {
    partitions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPartitionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListPartitionsResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                partitions_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.Partition>();
                mutable_bitField0_ |= 0x00000001;
              }
              partitions_.add(
                  input.readMessage(
                      com.google.cloud.dataplex.v1.Partition.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        partitions_ = java.util.Collections.unmodifiableList(partitions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.ListPartitionsResponse.class,
            com.google.cloud.dataplex.v1.ListPartitionsResponse.Builder.class);
  }

  public static final int PARTITIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataplex.v1.Partition> partitions_;
  /**
   *
   *
   * <pre>
   * Partitions under the specified parent entity.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataplex.v1.Partition> getPartitionsList() {
    return partitions_;
  }
  /**
   *
   *
   * <pre>
   * Partitions under the specified parent entity.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataplex.v1.PartitionOrBuilder>
      getPartitionsOrBuilderList() {
    return partitions_;
  }
  /**
   *
   *
   * <pre>
   * Partitions under the specified parent entity.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
   */
  @java.lang.Override
  public int getPartitionsCount() {
    return partitions_.size();
  }
  /**
   *
   *
   * <pre>
   * Partitions under the specified parent entity.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Partition getPartitions(int index) {
    return partitions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Partitions under the specified parent entity.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.PartitionOrBuilder getPartitionsOrBuilder(int index) {
    return partitions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * remaining results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * remaining results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < partitions_.size(); i++) {
      output.writeMessage(1, partitions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < partitions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, partitions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.ListPartitionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.ListPartitionsResponse other =
        (com.google.cloud.dataplex.v1.ListPartitionsResponse) obj;

    if (!getPartitionsList().equals(other.getPartitionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getPartitionsCount() > 0) {
      hash = (37 * hash) + PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.ListPartitionsResponse prototype) {
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
   * List metadata partitions response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.ListPartitionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.ListPartitionsResponse)
      com.google.cloud.dataplex.v1.ListPartitionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.ListPartitionsResponse.class,
              com.google.cloud.dataplex.v1.ListPartitionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.ListPartitionsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPartitionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        partitionsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_ListPartitionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListPartitionsResponse getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.ListPartitionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListPartitionsResponse build() {
      com.google.cloud.dataplex.v1.ListPartitionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListPartitionsResponse buildPartial() {
      com.google.cloud.dataplex.v1.ListPartitionsResponse result =
          new com.google.cloud.dataplex.v1.ListPartitionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (partitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          partitions_ = java.util.Collections.unmodifiableList(partitions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.partitions_ = partitions_;
      } else {
        result.partitions_ = partitionsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.dataplex.v1.ListPartitionsResponse) {
        return mergeFrom((com.google.cloud.dataplex.v1.ListPartitionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.ListPartitionsResponse other) {
      if (other == com.google.cloud.dataplex.v1.ListPartitionsResponse.getDefaultInstance())
        return this;
      if (partitionsBuilder_ == null) {
        if (!other.partitions_.isEmpty()) {
          if (partitions_.isEmpty()) {
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartitionsIsMutable();
            partitions_.addAll(other.partitions_);
          }
          onChanged();
        }
      } else {
        if (!other.partitions_.isEmpty()) {
          if (partitionsBuilder_.isEmpty()) {
            partitionsBuilder_.dispose();
            partitionsBuilder_ = null;
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partitionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPartitionsFieldBuilder()
                    : null;
          } else {
            partitionsBuilder_.addAllMessages(other.partitions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.dataplex.v1.ListPartitionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataplex.v1.ListPartitionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.dataplex.v1.Partition> partitions_ =
        java.util.Collections.emptyList();

    private void ensurePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partitions_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.Partition>(partitions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.Partition,
            com.google.cloud.dataplex.v1.Partition.Builder,
            com.google.cloud.dataplex.v1.PartitionOrBuilder>
        partitionsBuilder_;

    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.Partition> getPartitionsList() {
      if (partitionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partitions_);
      } else {
        return partitionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public int getPartitionsCount() {
      if (partitionsBuilder_ == null) {
        return partitions_.size();
      } else {
        return partitionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Partition getPartitions(int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);
      } else {
        return partitionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder setPartitions(int index, com.google.cloud.dataplex.v1.Partition value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.set(index, value);
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder setPartitions(
        int index, com.google.cloud.dataplex.v1.Partition.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.set(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(com.google.cloud.dataplex.v1.Partition value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(int index, com.google.cloud.dataplex.v1.Partition value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(index, value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(com.google.cloud.dataplex.v1.Partition.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(
        int index, com.google.cloud.dataplex.v1.Partition.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder addAllPartitions(
        java.lang.Iterable<? extends com.google.cloud.dataplex.v1.Partition> values) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, partitions_);
        onChanged();
      } else {
        partitionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder clearPartitions() {
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partitionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public Builder removePartitions(int index) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.remove(index);
        onChanged();
      } else {
        partitionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Partition.Builder getPartitionsBuilder(int index) {
      return getPartitionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public com.google.cloud.dataplex.v1.PartitionOrBuilder getPartitionsOrBuilder(int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);
      } else {
        return partitionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataplex.v1.PartitionOrBuilder>
        getPartitionsOrBuilderList() {
      if (partitionsBuilder_ != null) {
        return partitionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partitions_);
      }
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Partition.Builder addPartitionsBuilder() {
      return getPartitionsFieldBuilder()
          .addBuilder(com.google.cloud.dataplex.v1.Partition.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Partition.Builder addPartitionsBuilder(int index) {
      return getPartitionsFieldBuilder()
          .addBuilder(index, com.google.cloud.dataplex.v1.Partition.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Partitions under the specified parent entity.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Partition partitions = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.Partition.Builder>
        getPartitionsBuilderList() {
      return getPartitionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.Partition,
            com.google.cloud.dataplex.v1.Partition.Builder,
            com.google.cloud.dataplex.v1.PartitionOrBuilder>
        getPartitionsFieldBuilder() {
      if (partitionsBuilder_ == null) {
        partitionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataplex.v1.Partition,
                com.google.cloud.dataplex.v1.Partition.Builder,
                com.google.cloud.dataplex.v1.PartitionOrBuilder>(
                partitions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        partitions_ = null;
      }
      return partitionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.ListPartitionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.ListPartitionsResponse)
  private static final com.google.cloud.dataplex.v1.ListPartitionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.ListPartitionsResponse();
  }

  public static com.google.cloud.dataplex.v1.ListPartitionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPartitionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPartitionsResponse>() {
        @java.lang.Override
        public ListPartitionsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListPartitionsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListPartitionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPartitionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.ListPartitionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
