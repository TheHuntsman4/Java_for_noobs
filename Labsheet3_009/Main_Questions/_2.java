import java.util.*;

public class _2{
    public static void main(String[] args){
        float total=0;
        Scanner scan= new Scanner(System.in);
        float PE1=scan.nextFloat();
        total+=PE1*0.1;
        float PE2=scan.nextFloat();
        total+=PE2*0.15;
        float CE=scan.nextFloat();
        total+=CE*0.35;
        float End_Sem=scan.nextFloat();
        total+=End_Sem*0.4;
        System.out.println("your total is "+total);
        
        if(total>=90){
            System.out.println("Grade O");
        }
        else if(total>=80){
            System.out.println("Grade A+");
        }
        else if(total>=70){
            System.out.println("Grade A");
        }
        else if(total>=60){
            System.out.println("Grade B+");
        }
        else if(total>=50){
            System.out.println("Grade B");
        }
        else if(total>=45){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}

//a. Final score >= 90 – Grade O
// b. Final score >=80 and < 90 – Grade A+
// c. Final score >=70 and < 80 – Grade A
// d. Final score >=60 and < 70 – Grade B+
// e. Final score >=50 and < 60 – Grade B
// f. Final score >=45 and < 50 – Grade C
// g. Final score < 45 – Grade F