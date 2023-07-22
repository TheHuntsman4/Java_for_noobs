package Thread_Demo;


public class Counter {
    private int val;
    public Counter(){
        val=0;
    }
    public void increment(){
        ++val;
        print();
    }
    public void decrement(){
        --val;
        print();
    }
    public void print(){
        System.out.println(val);
    }
}
