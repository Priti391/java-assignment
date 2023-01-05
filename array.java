/**
    * Array
    */
    public class array {
     public static void main(String[] args) {
            /*classroom of 500 students- you have  to store  marks of these 500 students
             1 option: 500 variable
             2 option: use array*/
             int []marks =new int[5];
             marks[0] = 100; //Note that index starts from 0 
             marks[1] = 70;
       marks[2] = 98 ;
       marks[3] = 98 ;
       marks[4] = 98 ;
       marks[4] = 68 ;
       marks[5] = 80 ;//throws an error
        System.out.println(marks[4]);
           }
   
    }
