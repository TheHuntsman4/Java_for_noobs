import java.util.*;

public class _7{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter your details ( Name, Fullname, Age, Address, Hieght, Marks)");
String name=scan.nextLine();
String fullname=scan.nextLine();
int age=scan.nextInt();
scan.nextLine();
String address=scan.nextLine();
double height=scan.nextDouble();
float marks=scan.nextFloat();

scan.close();
System.out.println("\n");
System.out.println("Your details\n");

System.out.print(

	"Name: "+name+"\n"+
	"FullName: "+fullname+"\n"+
	"Age: "+age+"\n"+
	"Address: "+address+"\n"+
	"Height: "+height+"\n"+
	"Marks: "+marks+"\n"
	

);

}}


