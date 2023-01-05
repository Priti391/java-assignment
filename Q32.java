import java.util.*;
public class Q32 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter subject marks:- ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        float avg=(m1+m2+m3)/3;
        if(avg>=60)
        System.out.print("First Division");
        else if(avg>=45 && avg<60)
        System.out.print("Second Division");
        else if(avg>=33 && avg<45)
        System.out.print("Third Division");
        else
        System.out.print("Fail");
    }
    
}
