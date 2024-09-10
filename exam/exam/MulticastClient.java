import java.io.*;
import java.net.*;
public class MulticastClient{
    public static void main(String[] args) throws IOException,UnknownHostException{

        MulticastSocket client = new MulticastSocket();

        InetAddress group = InetAddress.getByName("224.224.200.20");

        String msg = "heyy how are youu";
        byte[] buf = msg.getBytes();

        DatagramPacket packet = new DatagramPacket(buf,buf.length,group,2444);

        client.send(packet);

    }
}