import java.net.*;
public class URLEncode{
    public static void main(String[] args)throws Exception{
        System.out.println(URLEncoder.encode("This string has spaces","UTF-8"));
        System.out.println(URLEncoder.encode("This string has space and % and & and @ #"));
    }
}