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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
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
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
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
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
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
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
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
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
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
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
