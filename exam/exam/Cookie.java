import java.net.*;
import java.io.*;
import java.util.*;

public class CookieDemo{
    public static void main(String[] args)throws IOException , MalformedURLException{


        URL url = new URL("https://www.facebook.com");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        CookieManager cm = new CookieManager();
        CookieHandler.setDefault(cm);

        CookieStore cookieStore = cm.getCookieStore();
        List<HttpCookie> cookies = cookieStore.getCookies();

        for(HttpCookie cookie : cookies){
          System.out.println("Stored Cookie: " + cookie);
        }


    }
}