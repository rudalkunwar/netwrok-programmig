import java.io.*;
import java.net.*;

public class UDPServer{
    public static void main(String[] args) throws IOException{

        DatagramSocket server = new DatagramSocket(3999);

        byte[] buffer = new byte[256];

        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        server.receive(packet);

        String msg = new String(packet.getData());

        System.out.println("The message from client is :"+msg);
        
        server.close();
    }
}