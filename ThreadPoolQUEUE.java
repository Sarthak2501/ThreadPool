import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
    private String taskName;

    public Tasks(String str){
        taskName = str;
    }
    @Override
    public void run() {
        try {
            for (int j = 0; j < 5 ; j++){
                if (j==0){
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh.mm.ss");
                    System.out.println("Initialization time for the task name : " + taskName + " = "+ sdf.format(dt));
                }
                else{
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh.mm.ss");
                    System.out.println("Time of execution for the task name : " + taskName + " = " + sdf.format(dt));
                }
                Thread.sleep(1000);
            }
            System.out.println(taskName + " is completed.");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}


public class ThreadPoolQUEUE {

    public static int MAX_TH = 2;
    public static void main(String[] args) {

        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        pl.shutdown();

    }

}



//   It is evident by looking at the output of the program that tasks 4 and 5 are executed only when the thread has an idle thread.
//   Until then, the extra tasks are put in the queue.

//   when one wants to execute 50 tasks but is not willing to create 50 threads. In such a case, one can create a pool of 10 threads.
//   Thus, 10 out of 50 tasks are assigned, and the rest are put in the queue.
//   Whenever any thread out of 10 threads becomes idle, it picks up the 11th task. The other pending tasks are treated the same way.

