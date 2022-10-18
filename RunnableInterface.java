import java.nio.channels.MulticastChannel;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is Running....");
    }


    public static void main(String[] args) {
        RunnableInterface r1 = new RunnableInterface();
        Thread t1 = new Thread(r1);

        t1.start();
    }
}
