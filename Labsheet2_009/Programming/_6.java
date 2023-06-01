import java.util.*;

public class _6{
    public static void main(String[] args){
        float total=0;
        Scanner scan= new Scanner(System.in);
        float PE1=scan.nextFloat();
        total+=PE1*0.1;
        float PE2=scan.nextFloat();
        total+=PE2*0.15;
        float CE=scan.nextFloat();
        total+=CE*0.35;
        float End_Sem=scan.nextFloat();
        total+=End_Sem*0.4;
        System.out.println("your total is "+total);
    }
}