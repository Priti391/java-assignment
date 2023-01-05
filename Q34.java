import java.util.*;
public class Q34 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charcater:- ");
        String chr=sc.next();
        char ch=chr.charAt(0);
        int ascii_value=ch;
        System.out.print("ASCII Value of "+ch+" is:- "+ascii_value);
    }
    
}
