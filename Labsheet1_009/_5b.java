import java.util.*;

public class _5b{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
System.out.println("enter the number of inputs ");
int n=scan.nextInt();
int sum=0;
int i=0;
while(i<n){
sum+=scan.nextInt();
i++;
}
System.out.printf("The sum of inputs is %d",sum);
}}
