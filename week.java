public class week {
    //if else if ladder  
import java.io.*;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose the weekdays in number(1-7) : ");
        int week=Integer.parseInt(br.readLine());
        if(week==1)
            System.out.println("Monday");
        else if(week==2)
            System.out.println("Tuesday");
        else if(week==3)
            System.out.println("Wednesday");
        else if(week==4)
            System.out.println("Thursday");
        else if(week==5)
            System.out.println("Friday");
        else if(week==6)
            System.out.println("Saturday");
        else if(week==7)
            System.out.println("Sunday");
        else
            System.out.println("Wrong Choice");
            /*if(week==10) //this if is not the part of above else if ladder
            System.out.print("not valid");*/
    }
}
