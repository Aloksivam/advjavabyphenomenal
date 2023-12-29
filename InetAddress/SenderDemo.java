// package InetAddress;
import java.net.*;
public class SenderDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket dos = new DatagramSocket();
        String str = "alok ji";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        dos.send(dp);
        dos.close();

    }
}
