import java.util.*;


public class countprime {
     public static void isprime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return;
            }
            
        }
        System.out.print(num+",");
    }
    public static void rangeprime(int start,int end){
        System.out.print("The prime numbers are :");
       for(int i=start;i<=end;i++){
        isprime(i);
       }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting value :");
        int start=sc.nextInt();
        System.out.print("Enter the ending value :");
        int end=sc.nextInt();
        rangeprime(start,end);
    }
}
