import java.util.*;

public class _6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(num!=0){
            int r = num%10;
            if(r%2==0){
                even++;
            }
            else{
                odd++;
            }
            num/=10;
        }
        System.out.println("number of even digits = "+even);
        System.out.println("number of odd digits = "+odd);
    }
}
