
import java.util.*;
public class slice {
    public static void part(int num){
        int count=0;
        int lastdigit;
        while(num>0){
            lastdigit=num%10;
            count=count+lastdigit;
            num=num/10;
        }
        if(count>10){
            part(count);
        }
       else{
        System.out.print("The sum of digits is :"+count);
       }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        part(num);

    }
    
}
