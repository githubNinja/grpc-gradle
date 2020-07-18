package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.MyHelloServiceImpl;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8080)
                .addService(new MyHelloServiceImpl()).build();

        System.out.println("Starting server...");
        try {
            server.start();
            System.out.println("Server started!");
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
