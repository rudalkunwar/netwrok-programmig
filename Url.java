import java.net.URL;
public class Url {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.google.com");
            System.out.println(u.getProtocol());
            System.out.println(u); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
