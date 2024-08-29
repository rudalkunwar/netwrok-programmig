import java.net.*;
import java.io.*;
public class ClientSocketDemo{
    public static void main(String[] args){
        try{

            Socket socket = new Socket("time.nist.gov",13);
            InputStream in = socket.getInputStream();

            InputStreamReader reader = new InputStreamReader(in);

            // for(int c = reader.read();c!=-1;c=reader.read())  {
            //     // time.append((char) c );
            //         System.out.print((char) c);
            // } 

            BufferedReader r = new BufferedReader(reader);

            r.lines().forEach(System.out::print);       

            // System.out.println(time);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}