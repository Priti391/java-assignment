    //- Write a program which enter marks in three subject of a student and
//calculate its average if the average is 33 or more than print pass otherwise print fail.
import java.util.*;
public class Q33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first sub matks : ");
		int sub1 = sc.nextInt();
		System.out.println("Enter the first sub matks : ");
		int sub2 = sc.nextInt();
		System.out.println("Enter the first sub matks : ");
		int sub3 = sc.nextInt();
		int total = sub1+sub2+sub3;
		double per = total/3;
		if(per<33)
		{
			System.out.println("You are fail.");
		}
		else
		{
			System.out.println("You are pass.");
		}
	}
}
