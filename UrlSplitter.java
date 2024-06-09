import java.net.*;

public class URLSplitter {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            try {
                URI uri = new URI(args[i]);
                URL u = uri.toURL();
                
                System.out.println("The URL is " + u);
                System.out.println("The scheme is " + u.getProtocol());
                System.out.println("The user info is " + u.getUserInfo());
                String host = u.getHost();
                if (host != null) {
                    int atSign = host.indexOf('@');
                    if (atSign != -1) host = host.substring(atSign + 1);
                    System.out.println("The host is " + host);
                } else {
                    System.out.println("The host is null.");
                }
                System.out.println("The port is " + u.getPort());
                System.out.println("The path is " + u.getPath());
                System.out.println("The ref is " + u.getRef());
                System.out.println("The query string is " + u.getQuery());
            } catch (MalformedURLException ex) {
                System.err.println(args[i] + " is not a URL I understand.");
            } catch (URISyntaxException ex) {
                System.err.println(args[i] + " is not a valid URI syntax.");
            }
            System.out.println();
        }
    }
}
