import java.util.*;

public class _4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean flag=true;
        while(num>0){
            int digit=num%10;
            if(digit%2!=0){
                flag=false;
                break;
            }
            num/=10;
        }
    if(flag){
        System.out.println("Bean won");
    }
    else{
        System.out.println("Bean lost");
    }
    }
}