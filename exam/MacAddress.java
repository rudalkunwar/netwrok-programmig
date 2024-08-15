import java.net.*;

public class SimpleMacAddress {
    public static void main(String[] args) throws Exception {

        InetAddress localHost = InetAddress.getLocalHost();

        NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);

        byte[] mac = networkInterface.getHardwareAddress();

        if (mac != null) {
            System.out.println("Mac address is ");
            
            for (int i = 0; i < mac.length; i++) {
            System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
            }

        } else {
            System.out.println("MAC Address not available.");
        }
    }
}
