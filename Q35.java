import java.util.*;
public class Q35 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charcater:- ");
        String chr=sc.next();
        char ch=chr.charAt(0);
        int ascii_value=ch;
        if(ascii_value>=65 && ascii_value<=90)
        System.out.print("Charcater is Capital Alphabet");
        else if(ascii_value>=97 && ascii_value<=122)
        System.out.print("Character is Small Alphabet");
        else if(ascii_value>=48 && ascii_value<=57)
        System.out.print("Character is Digit");
        else 
        System.out.print("Charcter is a Special Character");

    }
    
}
