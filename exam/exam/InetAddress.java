//InetAddress represent the ip address in java
// this helps to work with ip addresses in java
// the inet address object can be created by following methods
// 1.getByName("domain") // we can also pass ip address of the domain
// 2.getByAdress("ip")
// 3.getLocalhost()

import java.net.*;
public class InetDemo{
    public static void main(String[] args) throws UnknownHostException{
        InetAddress add = InetAddress.getByName("wwww.facebook.com");
        InetAddress add2 = InetAddress.getLocalHost();
        System.out.println(add2.toString());
    }
}