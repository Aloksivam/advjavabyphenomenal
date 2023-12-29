package Url;
import java.net.MalformedURLException;
import java.net.URL;
public class Urldemo {
    public static void main(String[] args)  throws MalformedURLException{
        URL ur = new URL("http://www.gita.in/academics");
        System.out.println("protocol: " +ur.getProtocol());
        System.out.println("protocol: " +ur.getHost());
        System.out.println("protocol: " +ur.getPort());
        System.out.println("protocol: " +ur.getFile());
    }
    
}
