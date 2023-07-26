public class _1 {
    public static void main(String[] args) {
        int N = 10;

        Runnable printer1 = new NumberPrinter(N / 2);
        Runnable printer2 = new NumberPrinter(N / 2 + N % 2);

        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);

        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    private int count;

    public NumberPrinter(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " ");
        }
    }
}
