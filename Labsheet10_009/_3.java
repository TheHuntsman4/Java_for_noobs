public class _3 extends Thread {
    @Override
    public void run() {
        String myName = "Thushar";
        System.out.println("From run: " + myName);
    }

    public static void main(String[] args) {
        _3 myThread = new _3();
        myThread.start();
    }
}
