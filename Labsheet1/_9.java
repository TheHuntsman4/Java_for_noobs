public class _9{
public static void main(String[] args){

char c1='@';
int  unicode=Character.getNumericValue(c1);   
String bin= Integer.toBinaryString(unicode);
String hex = Integer.toHexString(unicode);
System.out.println("this is the char value "+c1);
System.out.println("this is the unicode "+unicode);
System.out.println("this is the binary "+bin);
System.out.println("this is the hexadecimal "+hex);
}}
