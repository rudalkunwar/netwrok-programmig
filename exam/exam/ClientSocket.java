import java.net.*;
import java.util.*;
import java.io.*;
public class ClientSocket {
    public static void main(String[] args) throws SocketException,IOException{

        Socket socket = new Socket("localhost",5000);

        System.out.println("Connected to the server");

        OutputStream os = socket.getOutputStream();

        PrintWriter writer = new PrintWriter(os,true);

        writer.println("Hello how are you boy");

        socket.close();
    }
}