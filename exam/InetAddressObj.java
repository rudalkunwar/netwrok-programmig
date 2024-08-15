import java.net.*;

public class InetAddressObj {
    public static void main(String[] args) throws UnknownHostException {
        // Static methods for creating InetAddress objects
        InetAddress localAddr = InetAddress.getLocalHost(); // Get local host address
        InetAddress[] allGoogleAddrs = InetAddress.getAllByName("www.google.com"); // Get all IP addresses for a hostname
        InetAddress googleAddr = InetAddress.getByName("www.google.com"); // Get one IP address for a hostname
        
        // Example of using getByAddress with a byte array
        byte[] ipAddress = {(byte) 142, (byte) 250, (byte) 190, (byte) 36};
        InetAddress addrFromBytes = InetAddress.getByAddress(ipAddress);
        
        InetAddress loopbackAddr = InetAddress.getLoopbackAddress(); // Get loopback address (localhost/127.0.0.1)

        // Accessing information from InetAddress object
        System.out.println("Canonical Host Name: " + googleAddr.getCanonicalHostName());
        System.out.println("Host Name: " + googleAddr.getHostName());
        System.out.println("IP Address: " + googleAddr.getHostAddress());
        System.out.println("Local Host Address: " + localAddr.getHostAddress());
        System.out.println("Loopback Address: " + loopbackAddr.getHostAddress());
        System.out.println("Address: " +googleAddr.getAddress());

        // Printing all IP addresses for www.google.com
        System.out.println("All Google IP Addresses:");
        for (InetAddress addr : allGoogleAddrs) {
            System.out.println(addr);
        }
    }
}
