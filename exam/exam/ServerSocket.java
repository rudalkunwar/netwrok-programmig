import java.net.*;
import java.util.*;
import java.io.*;
public class ServerSocketDemo {
    public static void main(String[] args) throws SocketException,IOException{

        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server Socket started");

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        br.lines().forEach(System.out::println);

        ss.close();
        socket.close();
    }
}