import java.util.*;

class Employee{
    String name;
    int year;
    String address;
    double salary;

    public Employee(String name, int yearOfJoining, String address, double salary) {
        this.name = name;
        this.year = yearOfJoining;
        this.address = address;
        this.salary = salary;
    }
    public void displayInformation() {
        System.out.println(name + " " + year + " " + address + " " + salary);
    }
}

public class _1{
    public static void main(String[] args){

        
        Employee emp1=new Employee("Aniketh", 2022, "address@address", 100000);
        Employee emp2=new Employee("someone", 2022, "address@address", 100000);
        Employee emp3=new Employee("someone_else", 2022, "address@address", 100000);

        emp1.displayInformation();
        emp2.displayInformation();
        emp3.displayInformation();

        

        
    }
}