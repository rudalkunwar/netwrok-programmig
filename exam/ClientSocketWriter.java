import java.net.*;
import java.io.*;
public class ClientSocketWriter{
    public static void main(String[] args){
        try{

            Socket socket = new Socket("dict.org",2628);
            OutputStream out = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(out,"UTF-8");
            writer = new BufferedWriter(writer);

            writer.write("DEFINE eng-lat " + "banana" + "\r\n");
            writer.write("quit\r\n");

            writer.flush();

            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader r = new BufferedReader(reader);

            r.lines().forEach(System.out::print);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}