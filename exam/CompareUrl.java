import java.net.*;
public class CompreURL{
    public static void main(String[] args) throws MalformedURLException{
        URL ru = new URL("https://www.rudalkunwar.com.np");
        URL ro = new URL("https://rudalkunwar.com.np");

        if(ru.equals(ro)){
            System.out.println("Both are same url");
        }else{
            System.out.println("Both are different url");
        }
    }
}