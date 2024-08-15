import java.net.*;
import java.io.*;
public class Client{
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",3000);
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            output.writeUTF("HEllo server");

            output.flush();
            output.close();
            s.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}