import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadUrl {
    public static void main(String[] args) {
        ReadUrl readUrl = new ReadUrl();
        readUrl.read("http://www.lolcats.com");
    }

    public void read(String url) {
        try {
            URL u = new URL(url);
            InputStream in = u.openStream();
            int c;
            while ((c = in.read())!= -1) {
                System.out.write(c);
            }
            in.close();
        } catch (IOException ex) {
            System.err.println("Error reading URL: " + ex.getMessage());
        }
    }
}