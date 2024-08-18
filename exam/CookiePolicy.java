import java.net.*;
import java.io.*;
import java.util.*;

public class CookiePolicy {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.rudalkunwar.com.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        // Check if the URL ends with ".edu"
        if (url.getHost().endsWith(".edu")) {
            System.out.println("Cannot add cookie");
            return;
        } else {
            // Set the cookie if not an .edu domain
            String mycookie = "name=rudal";
            con.setRequestProperty("Cookie", mycookie);
        }

        // Connect to the server
        con.connect();

        // Get the response headers
        Map<String, List<String>> headerFields = con.getHeaderFields();
        List<String> cookieHeader = headerFields.get("Set-Cookie");

        // Check if the Set-Cookie header is present
        if (cookieHeader != null) {
            for (String cookie : cookieHeader) {
                System.out.println("Set-Cookie: " + cookie);
            }
        } else {
            System.out.println("No Set-Cookie header found.");
        }
    }
}
