import javax.swing.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

    private String message;
    public WorkerThread(String s){
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(start)message = "+message);

        processMessage();

        System.out.println(Thread.currentThread().getName()+"(END)");
    }

    private void processMessage(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

public class JavaThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10;i++){
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        //while(!executor.isTerminated()){ }

        System.out.println("Finished all threads");
    }
}
