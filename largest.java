//nested if program
import java.util.*;
public class largest {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter 1st number : ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd number : ");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter 3rd number : ");
        c=Integer.parseInt(br.readLine());      
        if(a>b){
            if(a>c){
                System.out.println(a+" is the largest no.");
            }
        } 
        else{
            if(b>c){
                System.out.println(b+" is the largest no.");
            }
            else{
                System.out.println(c+" is the largest no.");
            }
        }
        if(a<b){
            if(a<c){
                System.out.println(a+" is the smallest no.");
            }
        } 
        else{
            if(b<c){
                System.out.println(b+" is the smallest no.");
            }
            else{
                System.out.println(c+" is the smallest no.");
            }
        } 
    }
}
