public class inc1 {
    public static void main(String args[]){
        System.out.println("Enter two numbers");
        int a=10;
         int b=20;
         System.out.println("value of a="+a);
         System.out.println("value of b="+b);
         int r1;
         int r2;
         int r3;
         int r4;
         r1=++a;
        System.out.println("after increment:"+r1);
        r2=a++;
        System.out.println("after increment:"+r2);
        System.out.println("value of b="+b);
        r3=--b;
        System.out.println("after decrement:"+r3);
        r4=b--;
        System.out.println("after decrement:"+r4);
    }
}
