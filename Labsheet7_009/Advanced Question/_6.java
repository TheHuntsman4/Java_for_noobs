// Superclass
class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    // ...
}

// Subclass
 class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Additional methods
    // ...
}

// Superclass
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    // ...
}

// Subclass
 class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Additional methods
    // ...
}

// Superclass
 class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    // ...
}

// Subclass
 class Professor extends Employee {
    private String department;

    // Constructor
    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Additional methods
    // ...
}

// Superclass
class Vehicle {
    private String brand;
    private String model;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters
    // ...
}

// Subclass
 class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    // Additional methods
    // ...
}

