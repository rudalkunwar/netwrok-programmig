import java.net.*;
import java.io.*;
public class RetriveWebPage{
    public static void main(String[] args) throws MalformedURLException,IOException{
        
        URL addr = new URL("https://www.google.com");
        URLConnection uc = addr.openConnection();

        InputStream input = uc.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(input));

        br.lines().forEach(System.out::println);
        br.close();
    }
}