public class ThreadDemo implements Runnable {
    public void run(){
        System.out.println("Thread is runing");
    }
    public void intro(){
        System.out.println("i am implemented through runnable interface");
    }
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread t = new Thread(td);
        t.start();
    }
}
