import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception {
        Icalc ic = new Calc();
        Naming.rebind("127.0.0.1:1099/calculatorService", ic);
    }
    
}
