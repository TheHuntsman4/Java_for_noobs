import java.util.*;

public class _13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        int n = num;
        int rev=0;
        while(num!=0){
            int r = num%10;
            rev = rev*10 + r;
            num=num/10;
        }
        if(n == rev){
            System.out.println("number is a pallondrome");
        }
        else{
            System.out.println("number is not a pallondrome");
        }
    }
}
