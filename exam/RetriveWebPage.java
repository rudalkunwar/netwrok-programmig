import java.net.*;
import java.io.*;

public class RetrieveWebPage {
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL ru = new URL("https://www.rudalkunwar.com.np");
        URLConnection uc = ru.openConnection();

        InputStream raw = uc.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(raw));
        
        br.lines().forEach(System.out::println);

        br.close();
    }
}
