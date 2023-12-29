// package InetAddress;
import java.net.*;
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ia_lh = InetAddress.getLocalHost();
        System.out.println(ia_lh.getHostAddress());
        System.out.println(ia_lh.getHostName());
        System.out.println(ia_lh);
        InetAddress ia_name = InetAddress.getByName("www.gita.edu.in");
        // System.out.println(ia_name);
        // System.out.println(ia_name.getHostAddress());
        // System.out.println(ia_name.getHostName());
        InetAddress ia_all[] = InetAddress.getAllByName("www.gmail.com");
        for (int i = 0; i < ia_all.length; i++) {
            System.out.println(ia_all[i]);
        }
    }
}
