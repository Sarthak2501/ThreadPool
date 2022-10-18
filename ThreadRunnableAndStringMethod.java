public class ThreadRunnableAndStringMethod implements Runnable{

    @Override
    public void run() {
        System.out.println("Now the thread is running...");
    }

    public static void main(String[] args) {
        ThreadRunnableAndStringMethod r1 = new ThreadRunnableAndStringMethod();

        Thread t1  = new Thread(r1,"My thread");

        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
