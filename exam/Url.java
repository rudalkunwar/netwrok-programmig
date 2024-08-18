import java.net.*;
public class URLexample{
    public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("https://www.example.com:8080/path/to/resource.html?query=java&sort=asc#section2");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref: " + url.getRef());
    }
}