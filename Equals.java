import java.net.*;
public class Equals {
    public static void main(String[] args){
       try{
         URL url1 = new URL("http://www.google.com/rudal");
        URL url2 = new URL("http://www.google.com");
        if(url1.equals(url2)){
            System.out.println("The URLs are equal");
        } else {  
            System.out.println("The URLs are not equal");
        }
       }catch(MalformedURLException e){
           System.out.println(e);
       }


    }
}