import java.util.*;
public class Q66 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:- ");
        int num=sc.nextInt();
        int rno=0,tno=num;
        while(tno>0){
            int d=tno%10;
            rno=(rno*10)+d;
            tno=tno/10;
        }
        if(rno==num)
        System.out.print("Same");
        else 
        System.out.print("Not Same");
    }
    
}
