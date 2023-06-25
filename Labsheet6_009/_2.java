import java.util.Scanner;

import javax.swing.text.Style;

public class _2 {

    public static int largest(int[] arr,int total){
        int temp = arr[0];
        for(int i =1; i<total;i++){
            if(arr[i]>temp){
                temp=arr[i];
            } 
        }
        return temp;
    }

    public static int smallest(int[] arr,int total){
        int temp = arr[0];
        for(int i =1; i<total;i++){
            if(arr[i]<temp){
                temp=arr[i];
            } 
        }
        return temp;
    }    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  number of elements in the array: ");
        int n = scan.nextInt();
        int[] a=new int[n];
        for(int i =0 ;i<n;i++){
            a[i] = scan.nextInt();
    }
    scan.close();
    System.out.println("the largest number is "+largest(a, n));
    System.out.println("the smallest number is "+smallest(a, n));
}
}