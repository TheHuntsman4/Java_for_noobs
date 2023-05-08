import java.util.*;

public class _1{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the year of birth");
        int year=scan.nextInt();
        System.out.println("Enter the current year");
        int cur_year=scan.nextInt();
        System.out.println("You have been revolving around the sun for "+(cur_year-year)+" years");
        System.out.println("You have been revolving around the sun for "+(cur_year-year)*12+" Months");
        System.out.println("You have been revolving around the sun for "+(cur_year-year)*365+" days");

    }
}