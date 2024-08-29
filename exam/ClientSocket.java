import java.net.*;
import java.io.*;
import java.util.*;
public class ClientSocket{
    public static void main(String[] args)throws IOException{

        String host = "time.nist.gov";

        Socket s = new Socket(host,13);


        System.out.println("Information about socket : ")

        System.out.println("Local address "+s.getLocalAddress());
        System.out.println("Local port "+s.getLocalPort());

        System.out.println("Remote address "+s.getInetAddress());
        System.out.println("Remote port "+s.getPort());


        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is,"UTF-8");
        BufferedReader br = new BufferedReader(isr);
        br.lines().forEach(System.out::println);
        System.out.println(new Date().toString());
        // int line;
        // while(line=br.read()!=-1){
        //     System.out.println((char)line);
        // }

        s.close();
    }
}