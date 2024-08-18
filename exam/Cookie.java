import java.net.*;
import java.io.*;
import java.util.*;

public class CookieDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.google.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        // Set the request method
        con.setRequestMethod("GET");

        // Set a user-defined cookie
        String cookie = "username=rudal";
        con.setRequestProperty("Cookie", cookie);

        // Connect to the server
        con.connect();
        
        // Get response headers
        Map<String, List<String>> headerFields = con.getHeaderFields();
        List<String> cookiesHeader = headerFields.get("Set-Cookie");

        // Check if the Set-Cookie header is present
        if (cookiesHeader != null) {
            for (String cookiee : cookiesHeader) {
                System.out.println("Set-Cookie: " + cookiee);
            }
        } else {
            System.out.println("No Set-Cookie header found.");
        }
    }
}
