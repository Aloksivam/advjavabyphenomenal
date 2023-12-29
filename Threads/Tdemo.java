// package Threads;
public class Tdemo extends Thread {
    public void run(){
        System.out.println("Thread is runing");
    }
    public static void main(String[] args) {
        Tdemo td2 = new Tdemo();
        td2.start();
    }
}
