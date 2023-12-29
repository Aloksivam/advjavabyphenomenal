// package Icalculator;
import java.rmi.*;
import java.rmi.server.*;
public class Calc extends UnicastRemoteObject implements Icalc  {
    public  Calc() throws RemoteException{
        super();
    }
    public long add(long a, long b) throws RemoteException{
        return a +b;
    }
    public long sub(long a, long b) throws RemoteException{
        return a -b;
    }
    public long mul(long a, long b) throws RemoteException{
        return a*b;
    }
    public long div(long a, long b) throws RemoteException{
        return a/b;
    }
    
}
