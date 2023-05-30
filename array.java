import java.util.*;


public class array{

    public static void display(int[] arr){
        System.out.println("The values in the array are: ");
        for(int i :arr){
            System.out.println(i);
        }


    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the value of the element ");
            array[i]=scan.nextInt();
        }
        display(array);
    }
}
