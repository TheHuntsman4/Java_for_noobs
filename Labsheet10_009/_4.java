class printCount {
    public void count() {
        int lastDigitOfRollNumber = 7; // Replace with your last digit of roll number
        for (int i = 1; i <= lastDigitOfRollNumber + 2; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
        }
    }
}

class threadDemo extends Thread {
    private Thread t;
    private String threadName;
    private printCount P;

    public threadDemo(String name, printCount p) {
        threadName = name;
        P = p;
    }

    public void run() {
        synchronized (P) { // Synchronize on the shared printCount object to ensure proper order printing
            P.count();
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class _4 {
    public static void main(String[] args) {
        printCount P = new printCount();
        threadDemo t1 = new threadDemo("Thread1", P);
        threadDemo t2 = new threadDemo("Thread2", P);

        t1.start();
        t2.start();
    }
}
