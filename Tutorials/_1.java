import java.util.*;

public class _1{
	public static void main(String[] args){

int d,a;
try{
d=0;
a=42/d;
}

catch(Exception e){
System.out.println("This is a generic exception.");}
catch(ArithmeticException e){
System.out.println("Division by zero");
}
}
}
