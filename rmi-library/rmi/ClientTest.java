package rmi;

import java.net.InetSocketAddress;

public class ClientTest {

    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 12345);
        Server server = Stub.create(Server.class, address);

        System.out.println("Client said: " + "hi" + server.toString());
        try {
            System.out.println("Server replied: " + server.echo("hi").toString());
        } catch (RMIException re) {
            re.printStackTrace();
        }
    }
}