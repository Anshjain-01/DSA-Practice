import java.util.*;
public class product {
    public static int multiply(int a,int b){
        int mult=a*b;
        return mult;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 1st number:");
        int x=sc.nextInt();
         System.out.print("Enter the value of 2nd number:");
         int y=sc.nextInt();
        

        
        int multi=multiply(x, y);
        System.out.print("The product is :" + multi);


    }
}
