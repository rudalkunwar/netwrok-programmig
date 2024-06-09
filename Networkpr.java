import java.net.*;

public class Networkpr {
    public static void main(String[] args) {
        try {
            // Get the local loopback address (127.0.0.1)
            InetAddress local = InetAddress.getByName("127.0.0.1");
            
            // Get the network interface associated with the local address
            NetworkInterface ni = NetworkInterface.getByInetAddress(local);
            
            // If there is no network interface for the local address, print an error message
            if (ni == null) {
                System.err.println("That's weird. No local loopback address.");
            } else {
                System.out.println("Local loopback address found: " + ni.getName());
            }
        } catch (SocketException ex) {
            // If there's an error with sockets, print an error message
            System.err.println("Could not list network interfaces due to SocketException.");
        } catch (UnknownHostException ex) {
            // If the host is unknown, print an error message
            System.err.println("UnknownHostException occurred while getting loopback address.");
        }
    }
}
