import java.util.*;

public class prime {
    public static void isprime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.print("Entered number is not prime");
                return;
            }
            
        }
        System.out.println("Entered number is prime ");
        System.out.print(num);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        isprime(num);
    }
}
