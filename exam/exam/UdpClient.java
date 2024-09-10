import java.net.*;
import java.io.*;

public class UDPClient{
    
    public static void main(String[] args) throws IOException,UnknownHostException{
        
        DatagramSocket client = new DatagramSocket();

        InetAddress add = InetAddress.getByName("localhost");

        String msg = "heyyyyyyyy";

        byte[] buf = msg.getBytes();

        DatagramPacket packet = new DatagramPacket(buf,buf.length,add,3999);

        client.send(packet);

        client.close();
    }
}