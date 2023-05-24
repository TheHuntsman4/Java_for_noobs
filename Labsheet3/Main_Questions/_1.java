import java.util.*;

public class _1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the n digit number ");
        int number = scan.nextInt();
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }System.out.println(sum);

    }

}