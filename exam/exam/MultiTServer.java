import java.net.*;
import java.io.*;
public class MultiTServer {
    public static void main(String[] args)throws IOException,SocketException{

        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server started at 5000");

       while(true){

        Socket socket = ss.accept();

        ClientHandler ch = new ClientHandler(socket);
        Thread thread = new Thread(ch);
        thread.start();

       }
    
    }
}

public class ClientHandler implements Runnable{
    private Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    run(){
        try{

            InputStream in = socket.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            br.lines().forEach(System.out::println);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}