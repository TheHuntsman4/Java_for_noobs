import java.util.*;

public class _2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number of days ");
        int days = scan.nextInt();
        int years= days/365;
        days-=years*365;
        int weeks= days/7;
        days-=weeks*7;
        System.out.print("the number of years is "+years+" the number of weeks is "+weeks+" and the number of days is "+days);
    }
}
