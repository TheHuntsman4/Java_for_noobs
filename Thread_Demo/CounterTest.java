package Thread_Demo;



public class CounterTest {
    public static void main(String[] args){
        System.out.println("MAIN THREAD START");
        Counter c = new Counter();
        incrementer i = new incrementer(c);
        Decrementer d = new Decrementer(c);

        i.start();
        d.start();
        System.out.println("EXITING MAIN THREAD");
    }
}
