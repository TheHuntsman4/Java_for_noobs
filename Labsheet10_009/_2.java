public class _2 implements Runnable {
    @Override
    public void run() {
        String myName = "Thushara";
        System.out.println("From run: " + myName);
    }

    public static void main(String[] args) {
        _2 myThread = new _2();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
