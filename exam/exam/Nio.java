import java.net.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.files.*;
import java.util.*;

public class NIODemo{
    public static void main(String[] args) throws IOException{

        SocketChannel server = SocketChannel.open();

        SocketAddress socketAddr = new InetSocketAddress("localhost",9000);

        server.connect(socketAddr);

        Path path = Paths.get("/home/rudal-kunwar/network-programming/netwrok-programmig/exam/exam/myfile.txt");

        FileChannel fileChannel = FileChannel.open(path);

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(fileChannel.read(buffer)>0){
            buffer.flip();
            server.write(buffer);
            buffer.clear();
        }

        fileChannel.close();
        System.out.println("File is sent");
        server.close();
    }
}