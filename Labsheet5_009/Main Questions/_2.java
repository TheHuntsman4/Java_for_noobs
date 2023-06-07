import java.util.*;

class Student {
    private String name;
    private double cgpa;
    private int rollNo;
    private String batch;

    public Student(String name, double cgpa, int rollNo, String batch) {
        this.name = name;
        this.cgpa = cgpa;
        this.rollNo = rollNo;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void updateCgpa(double newCgpa) {
        cgpa = newCgpa;
    }

    public double getCgpa(){
        return cgpa;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getBatch(){
        return batch;
    }
}

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int N = scanner.nextInt();

        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();

            System.out.print("Batch: ");
            String batch = scanner.next();

            students[i] = new Student(name, cgpa, rollNo, batch);
        }

        System.out.println("Details of the students:");

        for (int i = 0; i < N; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("CGPA: " + students[i].getCgpa());
            System.out.println("Roll No: " + students[i].getRollNo());
            System.out.println("Batch: " + students[i].getBatch());
            System.out.println();
        }
    }
}
