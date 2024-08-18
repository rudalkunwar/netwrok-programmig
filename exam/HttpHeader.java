import java.net.*;
import java.io.*;
public class HttpHeader{
    public static void main(String[] args)throws MalformedURLException,IOException{
        URL url = new URL("https://www.google.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        for(String headername : con.getHeaderFields().keySet()){
            System.out.println(headername+":"+con.getHeaderField(headername));
        }
        
    }
}