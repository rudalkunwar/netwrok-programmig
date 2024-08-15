import java.io.*;
import java.net.*;

public class CompareIP {
    public static void main(String[] args) throws UnknownHostException {
        if (args.length == 0) {
            System.out.println("Please provide an IP address as an argument.");
            return;
        }

        InetAddress ia = InetAddress.getByName(args[0]);
        byte[] ip = ia.getAddress();

        if (ip.length == 4) {
            System.out.println("This is IPv4.");
        } else if (ip.length == 16) {
            System.out.println("This is IPv6.");
        } else {
            System.out.println("Invalid IP.");
        }
    }
}
