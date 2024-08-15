import java.net.*;
public class CheckSameAddress{
    public static void main(String[] args) throws UnknownHostException{
        if(args.length!=2){
            System.out.println("provide two address to compare");
        }
        InetAddress add1 = InetAddress.getByName(args[0]);
        InetAddress add2 = InetAddress.getByName(args[1]);

        if(add1.equals(add2)){
            System.out.println("They are same addresses");
        }else{
            System.out.println("They both are different addresses");
        }
    }
}