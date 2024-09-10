import java.net.*;
import java.io.*;
//InetAddress represent the ip address in java
// this helps to work with ip addresses in java
// the inet address object can be created by following methods
// 1.getByName("domain") // we can also pass ip address of the domain
// 2.getLocalhost()

// public class InetDemo{
//     public static void main(String[] args) throws UnknownHostException{
//         InetAddress add = InetAddress.getByName("wwww.facebook.com");
//         InetAddress add2 = InetAddress.getLocalHost();
//         System.out.println(add2.toString());
//     }
// }

//InetAddress Methods
// 1.getHostName()
// 2.getHostAddress()
// 3.getCanonicalHostName()

public class InetMethods{
    public static void main(String[] args) throws UnknownHostException,IOException{

        InetAddress adr = InetAddress.getByName("www.facebook.com");
        InetAddress adr2 = InetAddress.getByName("www.fb.com");

        System.out.println("The host name is "+adr.getHostName()); 
        System.out.println("The host ip address is "+adr.getHostAddress()); 
        System.out.println("The fully quilifed domain name is "+adr.getCanonicalHostName()); 


        if(adr.equals(adr2)){
            System.out.println("The domain are same ");
        }else{
            System.out.println("The domain are different ");
        }

        if(adr.isReachable(5000)){
            System.out.println("fb.com is reachable");
        }else{
            System.out.println("fb is not reachalbe");
        }
    }
}