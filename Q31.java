import java.util.*;
public class Q31 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter annual family income:- ");
        int income=sc.nextInt();
        System.out.print("Enter your age:- ");
        int age=sc.nextInt();
        if(income>=100000 && income<=200000 && age>=18 && age<=24)
        System.out.print("Eligible For Scolarship");
        else
        System.out.print("Not Eligible For Scolarship");
    }

    
}
