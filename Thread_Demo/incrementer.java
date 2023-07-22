package Thread_Demo;

public class incrementer extends Thread {
    private Counter counter;
    public incrementer (Counter c){
        counter = c;
    }
    public void run(){
        while(true){
            counter.increment();
        }
    }
}
