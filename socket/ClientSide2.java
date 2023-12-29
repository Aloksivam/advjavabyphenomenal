import java.io.*;
import java.net.*;


public class ClientSide2 {
    public static void main(String[] args) throws Exception {
        // ServerSocket ss = new ServerSocket(1234);
        Socket s = new Socket("localhost",1234);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter ur msg for serverside");
        String str1 = br.readLine(); // will take input from client side 
        dos.writeUTF(str1);
        dos.flush();
        String str2 = dis.readUTF();
        System.out.println("server says: "+str2);
        // ss.close();
        s.close();


    }

    
}
