import java.util.*;
public class Q64 {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer:- ");
    int num=sc.nextInt();
    while(num>=0){
        System.out.println(num);
        System.out.print("Enter an integer again Press any negative number for ending:- ");
        num=sc.nextInt();
    }
}
    
}
