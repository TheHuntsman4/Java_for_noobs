import package_name.classOne;
import package_one.classTwo;

public class Testing {
    public static void main(String[] args) {
        classOne obj1 = new classOne();
        classTwo obj2 = new classTwo();

        String name = "Aniketh";
        String rollno = "22009";

        obj1.methodOne(name);
        obj2.methodTwo(rollno);
    }
}
