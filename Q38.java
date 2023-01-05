import java.util.*;
public class Q38 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sales:- ");
        int sales=sc.nextInt();
        double commission=0.0;
        commission=(sales<=25000)?(0.05*sales):(0.07*sales);
        System.out.print("Commission= Rs "+commission);
    }
    
}
