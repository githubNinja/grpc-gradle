// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package proto.rpc;

public final class Hello {
  private Hello() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_rpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_rpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_rpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_rpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\tproto.rpc\"3\n\014HelloRequest" +
      "\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\" \n" +
      "\rHelloResponse\022\017\n\007message\030\001 \001(\t2P\n\014Hello" +
      "Service\022@\n\tsendHello\022\027.proto.rpc.HelloRe" +
      "quest\032\030.proto.rpc.HelloResponse\"\000B\002P\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_rpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_rpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_rpc_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_proto_rpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_rpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_rpc_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
