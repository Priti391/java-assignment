import java.util.*;
public class Q40 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your gender code M or m for Male and F or f for female:- ");
        String gender=sc.next();
        if(gender.equalsIgnoreCase("M"))
        System.out.print("Male");
        else if(gender.equalsIgnoreCase("F"))
        System.out.print("Female");
        else 
        System.out.print("Wrong Code");

    }
}
