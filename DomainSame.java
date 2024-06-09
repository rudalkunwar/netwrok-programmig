 import java.net.*;
 public class IBiblioAliases {
 public static void main (String args[]) {
 try {
 InetAddress ibiblio = InetAddress.getByName("www.facebook.com");
 InetAddress helios = InetAddress.getByName("www.fb.com");
 if (ibiblio.equals(helios)) {
 System.out.println
 ("www.ibiblio.org is the same as helios.ibiblio.org");
 } else {
 System.out.println
 ("www.ibiblio.org is not the same as helios.ibiblio.org");
 }
 } catch (UnknownHostException ex) {
 System.out.println("Host lookup failed.");
 }
 }
 }