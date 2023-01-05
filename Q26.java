import java.util.*;
public class Q26 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of words to be send by telegram:- ");
        int number_of_words=sc.nextInt();
        double charge=0.0;
        if(number_of_words<=10)
        charge=7.5;
        else
        charge=7.5+(number_of_words-10)*1.5;
        System.out.print("Telegram Charge= Rs "+charge);
    }
    
}
