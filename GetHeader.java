import java.util.*;
import java.io.*;
import java.net.*;

public class GetHeader {

    public static void main(String[] args) {
        String myurl = "https://www.google.com";

        try {
            URL u = new URL(myurl);
            URLConnection uc = u.openConnection();
            uc.connect();

            // Print all headers
            Map<String, List<String>> headers = uc.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Print the content type
            System.out.println("Content-Type: " + uc.getContentType());

        } catch (MalformedURLException e) {
            System.out.println("The URL is malformed: " + myurl);
        } catch (IOException e) {
            System.out.println("An I/O error occurred while trying to open the connection: " + e.getMessage());
        }
    }
}
