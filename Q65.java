import java.util.*;
public class Q65 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of term:- ");
        int term=sc.nextInt();
        if(term==1){
            System.out.print("1");
        }
        else{
            int a=0,b=1,c=0;
            System.out.print("1, ");
            for(int i=1;i<=term-1;i++){
                c=a+b;
                System.out.print(c+", ");
                a=b;
                b=c;
            }
        }
    
}
}
