import java.util.*;

public class _1{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int start=0;
        System.out.print("enter the number of spaces the frong moves ");
        int a= scan.nextInt();
        System.out.print("enter the number of times the frong moves ");
        int k =scan.nextInt();
        start=a*k;
        System.out.println("the position of the frog is "+start);
    }
}