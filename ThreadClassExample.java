
//Java Thread example by extending thread class

public class ThreadClassExample extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadClassExample t1 = new ThreadClassExample();
        t1.start();
    }
}
