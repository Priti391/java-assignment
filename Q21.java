    import java.util.Scanner;
    public class Q21 {
     public static void main(String []args)
     {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if( num > 18 )
        { 
           System.out.println("You are adult"); 

	    }
	    else
	    {
	        System.out.println("You are not adult");
	    }
     }
}
    

