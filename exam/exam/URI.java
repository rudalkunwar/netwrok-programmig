import java.io.*;
import java.net.*;

//uri is the uniform resource inditifier
//it is the string used to locate resource in the internet


// public class URIDemo{
//     public static void main(String[] args)throws MalformedURLException,IOException,URISyntaxException{

//         URL url = new URL("https://www.facebook.com/kuns.ruzal");

//         System.out.println("The url name is :"+url.toString());
//         System.out.println("The url protocol is :"+url.getProtocol());
//         System.out.println("The url host is :"+url.getHost());
//         System.out.println("The url path is :"+url.getPath());
//         System.out.println("The url port is :"+url.getPort());
//         System.out.println("The url query is :"+url.getQuery());
//         System.out.println("The url fragment is :"+url.getRef());

//         //for uri 
//         URI uri = new URI("https://www.example.com/path/to/resource");

//         System.out.println("The uri name is :"+uri.toString());
//         System.out.println("The uri protocol is :"+uri.getScheme());
//         System.out.println("The uri host is :"+uri.getHost());
//         System.out.println("The uri path is :"+uri.getPath());
//         System.out.println("The uri port is :"+uri.getPort());
//         System.out.println("The uri query is :"+uri.getQuery());
//         System.out.println("The uri fragment is :"+uri.getFragment());



//     }
// }


//geting http request using get

// public class HttpRequestDemo {

//     public static void main(String[] args) throws MalformedURLException, IOException {
//         // Create URL object
//         URL url = new URL("https://www.facebook.com/kuns.ruzal");

//         // Open connection
//         HttpURLConnection con = (HttpURLConnection) url.openConnection();

//         // Set request method to GET
//         con.setRequestMethod("GET");

//         // Connect to the URL
//         con.connect();

//         // Get the response code
//         int responseCode = con.getResponseCode();

//         // Print the response code
//         System.out.println("The response code is : " + responseCode);
//     }
// }

//setting and reading http headers

public class HttpHeadersDemo{
    public static void main(String[] args)throws IOException,MalformedURLException{
         
        URL url = new URL("https://www.facebook.com/kuns.ruzal");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent","MyHttpClient/1.0");
        con.setRequestProperty("Authorization","Berear dfajlsdjfaljkfdlkajldfashdf");
        con.setRequestProperty("Accept","appication/json");


        for(String headerName :con.getHeaderFields().keySet()){

            System.out.println(headerName +" :  "+ con.getHeaderField(headerName) + " \n");
        }


    }
}