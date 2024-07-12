import java.net.*;
public class UrlConfig{
    public static void main(String[] args){
        try{

            URL u = new URL("https://facebook.com");
            u.createConnection();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}