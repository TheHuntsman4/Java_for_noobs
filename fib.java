import java.util.*;

Scanner scan= new Scanner(System.in);
System.out.print("enter the number of iterations ");
int n = scan.nextInt();
int a=0,b=1,c=1;
System.out.print(a+" "+b+" ");
for(int i=0;i<n-2;i++){
System.out.print(c+" ");
a=b;
b=c;
c=a+b;

}
}
}
