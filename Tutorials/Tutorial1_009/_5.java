import java.util.*;

public class _5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total number of classes ");
        float tot_classes=scan.nextFloat();
        System.out.print("Enter the number of classes attended ");
        float att_classes=scan.nextFloat();
        float attendance = (att_classes/tot_classes)*100;
        if(attendance>=75.0){
        System.out.print("Student may attempt exams");
    }
    else{
        System.out.print("Student may not attempt exams");
    }
    }
}