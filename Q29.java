import java.util.*;
public class Q29 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a code:- ");
        int code=sc.nextInt();
        if(code==5 || code==7 || code==11 || code==24)
        System.out.print("Right Code");
        else
        System.out.print("Wrong Code");
    }
    
}
