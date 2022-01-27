/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dataplex.v1.stub;

import static com.google.cloud.dataplex.v1.MetadataServiceClient.ListEntitiesPagedResponse;
import static com.google.cloud.dataplex.v1.MetadataServiceClient.ListPartitionsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dataplex.v1.Entity;
import com.google.cloud.dataplex.v1.GetEntityRequest;
import com.google.cloud.dataplex.v1.GetPartitionRequest;
import com.google.cloud.dataplex.v1.ListEntitiesRequest;
import com.google.cloud.dataplex.v1.ListEntitiesResponse;
import com.google.cloud.dataplex.v1.ListPartitionsRequest;
import com.google.cloud.dataplex.v1.ListPartitionsResponse;
import com.google.cloud.dataplex.v1.Partition;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the MetadataService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcMetadataServiceStub extends MetadataServiceStub {
  private static final MethodDescriptor<GetEntityRequest, Entity> getEntityMethodDescriptor =
      MethodDescriptor.<GetEntityRequest, Entity>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dataplex.v1.MetadataService/GetEntity")
          .setRequestMarshaller(ProtoUtils.marshaller(GetEntityRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Entity.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListEntitiesRequest, ListEntitiesResponse>
      listEntitiesMethodDescriptor =
          MethodDescriptor.<ListEntitiesRequest, ListEntitiesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataplex.v1.MetadataService/ListEntities")
              .setRequestMarshaller(ProtoUtils.marshaller(ListEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListEntitiesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetPartitionRequest, Partition>
      getPartitionMethodDescriptor =
          MethodDescriptor.<GetPartitionRequest, Partition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataplex.v1.MetadataService/GetPartition")
              .setRequestMarshaller(ProtoUtils.marshaller(GetPartitionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Partition.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListPartitionsRequest, ListPartitionsResponse>
      listPartitionsMethodDescriptor =
          MethodDescriptor.<ListPartitionsRequest, ListPartitionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataplex.v1.MetadataService/ListPartitions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPartitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPartitionsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetEntityRequest, Entity> getEntityCallable;
  private final UnaryCallable<ListEntitiesRequest, ListEntitiesResponse> listEntitiesCallable;
  private final UnaryCallable<ListEntitiesRequest, ListEntitiesPagedResponse>
      listEntitiesPagedCallable;
  private final UnaryCallable<GetPartitionRequest, Partition> getPartitionCallable;
  private final UnaryCallable<ListPartitionsRequest, ListPartitionsResponse> listPartitionsCallable;
  private final UnaryCallable<ListPartitionsRequest, ListPartitionsPagedResponse>
      listPartitionsPagedCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcMetadataServiceStub create(MetadataServiceStubSettings settings)
      throws IOException {
    return new GrpcMetadataServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcMetadataServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcMetadataServiceStub(
        MetadataServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcMetadataServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcMetadataServiceStub(
        MetadataServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcMetadataServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcMetadataServiceStub(
      MetadataServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcMetadataServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcMetadataServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcMetadataServiceStub(
      MetadataServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetEntityRequest, Entity> getEntityTransportSettings =
        GrpcCallSettings.<GetEntityRequest, Entity>newBuilder()
            .setMethodDescriptor(getEntityMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListEntitiesRequest, ListEntitiesResponse> listEntitiesTransportSettings =
        GrpcCallSettings.<ListEntitiesRequest, ListEntitiesResponse>newBuilder()
            .setMethodDescriptor(listEntitiesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetPartitionRequest, Partition> getPartitionTransportSettings =
        GrpcCallSettings.<GetPartitionRequest, Partition>newBuilder()
            .setMethodDescriptor(getPartitionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListPartitionsRequest, ListPartitionsResponse>
        listPartitionsTransportSettings =
            GrpcCallSettings.<ListPartitionsRequest, ListPartitionsResponse>newBuilder()
                .setMethodDescriptor(listPartitionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();

    this.getEntityCallable =
        callableFactory.createUnaryCallable(
            getEntityTransportSettings, settings.getEntitySettings(), clientContext);
    this.listEntitiesCallable =
        callableFactory.createUnaryCallable(
            listEntitiesTransportSettings, settings.listEntitiesSettings(), clientContext);
    this.listEntitiesPagedCallable =
        callableFactory.createPagedCallable(
            listEntitiesTransportSettings, settings.listEntitiesSettings(), clientContext);
    this.getPartitionCallable =
        callableFactory.createUnaryCallable(
            getPartitionTransportSettings, settings.getPartitionSettings(), clientContext);
    this.listPartitionsCallable =
        callableFactory.createUnaryCallable(
            listPartitionsTransportSettings, settings.listPartitionsSettings(), clientContext);
    this.listPartitionsPagedCallable =
        callableFactory.createPagedCallable(
            listPartitionsTransportSettings, settings.listPartitionsSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetEntityRequest, Entity> getEntityCallable() {
    return getEntityCallable;
  }

  @Override
  public UnaryCallable<ListEntitiesRequest, ListEntitiesResponse> listEntitiesCallable() {
    return listEntitiesCallable;
  }

  @Override
  public UnaryCallable<ListEntitiesRequest, ListEntitiesPagedResponse> listEntitiesPagedCallable() {
    return listEntitiesPagedCallable;
  }

  @Override
  public UnaryCallable<GetPartitionRequest, Partition> getPartitionCallable() {
    return getPartitionCallable;
  }

  @Override
  public UnaryCallable<ListPartitionsRequest, ListPartitionsResponse> listPartitionsCallable() {
    return listPartitionsCallable;
  }

  @Override
  public UnaryCallable<ListPartitionsRequest, ListPartitionsPagedResponse>
      listPartitionsPagedCallable() {
    return listPartitionsPagedCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
