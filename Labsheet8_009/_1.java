interface InterfaceA{
    void Meth1();
    void Meth2();
    
} 

class InterfaceClass implements InterfaceA{
    public void Meth1(){
        System.out.println("This is the first method");
    }
    public void Meth2(){
        System.out.println("This is the second method");
    }       
}

public class _1{
    public static void main(String[] args){
        InterfaceClass InterfaceObject = new InterfaceClass();

        InterfaceObject.Meth1();
        InterfaceObject.Meth2();
    }
}