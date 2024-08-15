import java.net.*;
public class MacAddress{
    public static void main(String[] args) throws UnknownHostException,SocketException{

        InetAddress local = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(local);

        byte[] mac = ni.getHardwareAddress();
        if(mac!=null){
            System.out.print("The mac address is: ");
           for(int i=0;i<mac.length;i++){

            System.out.format("%02X%s",mac[i],(i<mac.length-1)?"-":"");
           }
           System.out.println();
        }
    }
}