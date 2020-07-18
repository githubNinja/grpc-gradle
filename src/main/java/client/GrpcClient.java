package client;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import proto.rpc.HelloRequest;


public class GrpcClient {

    public static void main(String[] args) {
        Channel channelObject = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        proto.rpc.HelloServiceGrpc.HelloServiceBlockingStub stub
                = proto.rpc.HelloServiceGrpc.newBlockingStub(channelObject);

        proto.rpc.HelloResponse helloResponse = stub.sendHello(HelloRequest.newBuilder()
                .setFirstName("KranT")
                .setLastName("D")
                .build());

        System.out.println("Response received from server:\n" + helloResponse);

    }
}
