public class switch 
{
    import java.io.*;
        public static void main(String[] args)throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the month number(1-12) to display month name : ");
            int month=Integer.parseInt(br.readLine());
            switch(month){
                case 1: System.out.println("January");
                        break;
                case 2: System.out.println("February");
                        break;
                case 3: System.out.println("March");
                        break;
                case 4: System.out.println("April");
                        break;
                case 5: System.out.println("May");
                        break;
                case 6: System.out.println("June");
                        break;
                case 7: System.out.println("July");
                        break;
                case 8: System.out.println("August");
                        break;
                case 9: System.out.println("September");
                        break;
                case 10: System.out.println("October");
                        break;
                case 11: System.out.println("November");
                        break;
                case 12: System.out.println("December");
                        break;
                default: System.out.println("Wrong Entry");
                break;
            }
                    /*String var = "Shubham";
            
            
                    switch (var) {
                        case "Shubham" -> {
                            System.out.println("You are going to become an Adult!");
                            System.out.println("You are going to become an Adult!");
                            System.out.println("You are going to become an Adult!");
                        }
                        case "Saurabh" -> System.out.println("You are going to join a Job!");
                        case "Vishaka" -> System.out.println("You are going to get retired!");
                        default -> System.out.println("Enjoy Your life!");
                    }*/
    
        }
    }
