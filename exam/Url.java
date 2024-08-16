import java.net.*;
public class URLexample{
    public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("https://www.example.com:8080/path/to/resource.html?query=java&sort=asc#section2");
        System.out.println(url.toString());
        System.out.println(url.getHost());
        System.out.println(url.getProtocol());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
    }
}