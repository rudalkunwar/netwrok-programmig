import java.net.*;
import java.io.*;
public class MulticastServer{
    public static void main(String[] args) throws IOException,UnknownHostException{

        MulticastSocket server = new MulticastSocket(2444);

        InetAddress group = InetAddress.getByName("224.224.200.20");

        server.joinGroup(group);
        
        byte[] buf = new byte[256];

        DatagramPacket packet = new DatagramPacket(buf,buf.length);

        server.receive(packet);

        String msg = new String(packet.getData());

        System.out.println(msg);
    }
}