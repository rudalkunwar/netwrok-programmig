import java.net.*;
import java.io.*;
public class Server{
    public static void main(String[] args){
        try{
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        DataInputStream input = new DataInputStream(s.getInputStream());
        String msg = input.readUTF();

        System.out.println("User message "+msg);
        ss.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}