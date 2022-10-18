public class ThreadStringMethod {
    public static void main(String[] args) {
        Thread t = new Thread("My fist thread");


        t.start();

        String str = t.getName();

        System.out.println(str);
    }
}
