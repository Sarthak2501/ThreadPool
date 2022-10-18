class ThreadJoin extends Thread{
    public void run(){
        for (int j = 0 ; j < 2 ; j++){
            try{
                Thread.sleep(300);
                //System.out.println("The current thread name is " + Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("The exception has been caught : " + e);
            }
            System.out.println(j);
        }
    }
}
public class ThreadJoinExample {
    public static void main(String[] args) {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        th1.start();

        try{
            System.out.println("The current Thread name is : " + Thread.currentThread().getName());
            //System.out.print(Thread.currentThread().getName());
            th1.join();
        }catch (Exception e){
            System.out.println("The exception has been caught " + e);
        }


        th2.start();

        try{
            System.out.println("The current Thread name is : " + Thread.currentThread().getName());
            th1.join();
        }catch (Exception e){
            System.out.println("The exception has been caught " + e);
        }

        th3.start();

//        try{
//            System.out.println("The current Thread name is : " + Thread.currentThread().getName());
//            th1.join();
//        }catch (Exception e){
//            System.out.println("The exception has been caught " + e);
//        }
    }
}
