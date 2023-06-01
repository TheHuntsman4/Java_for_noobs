import java.util.*;
public class _1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limiter");
        int limit=scan.nextInt();
        int n= scan.nextInt();
        while(n<=limit){
            n = scan.nextInt();
            if(n>=limit){
                break;
            }
        }
            
        System.out.println("done");

        
    }
}