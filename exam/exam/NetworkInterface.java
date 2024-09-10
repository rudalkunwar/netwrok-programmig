import java.net.*;
import java.io.*;
import java.util.*;

// the NetworkInterface class represents a network interface, such as an Ethernet or Wi-Fi card.

// public class NetworkInterfaceDemo{
//     public static void main(String[] args) throws SocketException{

//         NetworkInterface ntf = NetworkInterface.getByName("eth0");

//         // System.out.println(ntf.getName());
//     }
// }


//finding the mac address of the laptop

// public class MyMACAddress{
//     public static void main(String[] args) throws SocketException,UnknownHostException,IOException{
        
//         InetAddress addr = InetAddress.getLocalHost();

//         NetworkInterface ni = NetworkInterface.getByInetAddress(addr);

//         byte [] mac = ni.getHardwareAddress();

//         for(int i = 0 ; i < mac.length ; i ++){
//           System.out.format("0%2X%s", mac[i] , (i<mac.length-1)?"-":" ");
//         }
//     } 
// }

//finding all other network address\

public class NetworkInterfaceAddresses{
    public static void main(String[] args)throws SocketException , UnknownHostException , IOException{

        InetAddress addr = InetAddress.getLocalHost();

        NetworkInterface ni = NetworkInterface.getByInetAddress(addr);

        Enumeration <InetAddress> addresses = ni.getInetAddresses();

        while(addresses.hasMoreElements()){
            InetAddress obj = addresses.nextElement();
            System.out.println(obj.getHostAddress());
        }
    }
}