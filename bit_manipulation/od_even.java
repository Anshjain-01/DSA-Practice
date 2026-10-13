import java.util.*;
public class od_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        if((num&1)==1){
            System.out.print("The number is odd");
        }
        else{
            System.out.print("The number is even");
        }

        
    }
}
