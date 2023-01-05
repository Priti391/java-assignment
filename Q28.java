import java.util.*;
public class Q28 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your gender M or m for Male and F or f for female:- ");
        String gender=sc.next();
        if(gender.equalsIgnoreCase("M"))
        System.out.print("Gender is Male");
        else if(gender.equalsIgnoreCase("F"))
        System.out.print("Gender is Female");
    }
    
}
