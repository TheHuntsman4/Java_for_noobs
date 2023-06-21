import java.util.*;

public class _1{
public static int getSecondLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
}  


    public static void main(String[] args){
        int temp=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  number of elements in the array: ");
        int n = scan.nextInt();
        int[] a=new int[n];
        for(int i =0 ;i<n;i++){
            a[i] = scan.nextInt();
        }
        System.out.println(getSecondLargest(a, n));

    }
}