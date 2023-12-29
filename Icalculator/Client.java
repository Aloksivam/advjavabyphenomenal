// package Icalculator;
import java.rmi.*;
public class Client {
    public static void main(String[] args)throws Exception {
        Icalc ic = (Icalc)Naming.lookup("127.0.0.1:1099/calculatorService");
        System.out.println(ic.add(2, 33));

    }
    
}
