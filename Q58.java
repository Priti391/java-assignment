//  Program to calculate the average using an array
  public class Q58 {
    public static void main(String[] args) {
        double[] marks = {15, 8.99, 16, 18, 13.2, 10};
        double total = 0;
        for(int i=0; i < marks.length; i++){
          total = total + marks[i];
        }
        double avg = total / marks.length;
    
        System.out.format("The average is: %.2f", avg);
    }
}
