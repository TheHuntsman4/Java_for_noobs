    
abstract class Vehicle{
private int noOfPassengers;
public abstract void honk();
}

class Car extends Vehicle{
    public void honk(){
        System.out.println("Beeeep");
    }
}

class Boat extends Vehicle{
    public void honk(){
        System.out.println("VROOM");
    }
}


public class _7{
    public static void main(String[] args){
        Car car = new Car();
        Boat boat = new Boat();

        car.honk();  
        boat.honk(); 
    }


}
