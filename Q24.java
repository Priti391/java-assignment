 //Write a program which enter any integer and if it is less than 5 than calculate its cube
//otherwise calculate and print its square.
import java.util.*;
public class Q24 {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if(num>5)
		{
			System.out.println("Square of "+ num +" is "+(num*num));
		}
		else
		{
			System.out.println("Cube of "+ num +" is "+(num*num*num));
		}
	}
}
