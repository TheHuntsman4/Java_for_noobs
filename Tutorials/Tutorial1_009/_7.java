imoprt java.util.*;

public class _7{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
        System.out.println("enter marks = ");
        int marks = sc.nextInt();
        if(marks < 35){
            System.out.println("F");
        }
        else if(marks>=35 && marks<45){
            System.out.println("E");
        }
        else if(marks>=45 && marks<55){
            System.out.println("D");
        }
        else if(marks>=55 && marks<65){
            System.out.println("C");
        }
        else if(marks>=65 && marks<75){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }


}
}
