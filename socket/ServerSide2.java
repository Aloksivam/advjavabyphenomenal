import java.io.*;
import java.net.*;
public class ServerSide2 {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = dis.readUTF(); //will store msg sent by client side
        System.out.println("client : "+str);
        System.out.println("enter ur msg for client");
        String str2 = br.readLine();
        dos.writeUTF(str2);
        dos.flush();
        dos.close();
        dis.close();
        s.close();
        ss.close();
        
    }
}
