import java.util.*;

public class factorial {
    public static int fact(int num){
        int count=1;
        for(int i=1;i<=num;i++){
            count*=i;
        }
        return count;
    }
    public static int binomial(int n, int r){
        int s=fact(n)/(fact(r)*fact(n-r));
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value :");
        int num=sc.nextInt();
        int number=fact(num);
        System.out.println("The factorial of number is :"+number);
        System.out.print("Enter the vlaue of n :");
        int num1=sc.nextInt();
        System.out.print("Enter the vlaue of r :");
        int num2=sc.nextInt();
        int number2=binomial(num1,num2);
        System.out.print("The binomial coffeciant is :"+ number2);

    }
}
