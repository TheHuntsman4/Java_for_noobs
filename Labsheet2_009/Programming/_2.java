import java.util.*;

public class _2{
    public static void main(String[] args){
        double f=0;
        System.out.println("This is Program is for the function f(x,y)"+"\n"+"1.  ax^2y+by^2x+ab-xy"+"\n"+"2.  ab+pix^2-piy");
        Scanner scan = new Scanner(System.in);
        int flag=scan.nextInt();
        System.out.println("Enter values a and b");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Enter the values of the arguments x and y");
        int x=scan.nextInt();
        int y=scan.nextInt();
        if(flag==1){
            f=a*x*x*y+b*y*y*x+a*b-x*y;
        }
        else{
            f=(a*b)+(3.14*x*x)-(3.14*y);
        }
        System.out.println("The answer is "+f);   
    }
}