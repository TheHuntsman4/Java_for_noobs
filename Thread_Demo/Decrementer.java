package Thread_Demo;

public class Decrementer extends Thread {
    private Counter counter;
    public Decrementer(Counter c){
        counter = c;
    }
    public void run(){
        while(true){
            counter.decrement();
        }
        
    }
}
