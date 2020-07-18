package service;

import io.grpc.stub.StreamObserver;
import proto.rpc.HelloRequest;
import proto.rpc.HelloResponse;


public class MyHelloServiceImpl extends proto.rpc.HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sendHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse response =
                HelloResponse.newBuilder().setMessage("Welcome to Grpc ::" + request.getFirstName() + " " +
                request.getLastName() + "and here is the reply message::").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
