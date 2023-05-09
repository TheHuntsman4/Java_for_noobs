import java.util.*;

public class _3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
    System.out.println(rev);
    }
}
