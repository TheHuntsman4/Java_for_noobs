import java.util.*;

public class _3{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int val=scan.nextInt();
        int sum=val%10;
        val=val/10;
        sum+=val%10;
        val/=10;
        sum+=val;
        System.out.println(sum);

        
    }
}

