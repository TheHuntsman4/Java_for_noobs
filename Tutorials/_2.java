public class _2{
public static void main(String[] args){

try{
System.out.println("First statement of the try block");
int num=45/3;
System.out.println(num);}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ARRAY OUT OF BOUND");}
finally{
System.out.println("finally block is executed");}

System.out.println("Out of try-catch-finaly block");

}}
