import java.net.*;
public class Test{
    public static void main(String[] args){
      try{
          InetAddress ia = InetAddress.getByName("www.rudalkunwar.com.np");
        System.out.println(ia.getCanonicalHostName());
      }catch(Exception e){
        System.out.println(e);
      }
    }
}