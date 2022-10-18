public class ThreadSleepInJava extends Thread{
    public void run(){
        for (int i = 1; i < 5; i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleepInJava t1 = new ThreadSleepInJava();
        ThreadSleepInJava t2 = new ThreadSleepInJava();

        t1.start();
        t2.start();
    }
}
