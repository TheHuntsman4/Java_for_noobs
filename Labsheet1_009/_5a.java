import java.util.*;
import java.lang.Math;

public class _5a{    

 public static void main(String args[]){    
  int i=0,flag=0;
double m=0;
  Scanner scan= new Scanner(System.in);      
  int n=scan.nextInt();    
  m=Math.sqrt(n);      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)
    { 
    System.out.println(n+" is prime number");
     }  
  }  
}    
}   
