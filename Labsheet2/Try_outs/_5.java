import java.util. *;

public class _5 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System. in);
        double w,y;
        int a,b,c;
        System.out.println("ENTER THE VARIABLES AS FOLLOWS a,b,c,w,y"+"\n");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        w=scan.nextDouble();
        y=scan.nextDouble();
        System.out.println("a+b*c "+(a+b*c));
        System.out.println("a-b-c "+(a-b-c));
        System.out.println("-a>b "+(-a>b));
        System.out.println("b<a or y>w "+(b<a||y>w));
        System.out.println("a<b and c not equal to a "+(a<b && c!=a));
        System.out.println("-a>b "+(-a>b));
        System.out.println("25>=a-b/c "+(25>=a-b/c));
        System.out.println("a-b/c "+(a-b/c));
        System.out.println("a*b/c "+(a*b/c));
        System.out.println("w/y "+(w/y));
        System.out.println("y/w "+(y/w));
        System.out.println("a+w/b "+(a+w/b));
        System.out.println("a%b/y "+(a%b/y));
        System.out.println("b%a "+(b%a));
        System.out.println("exp "+(((a*a+3*b)*7)/2*(a*a*b*b)));
    }
}