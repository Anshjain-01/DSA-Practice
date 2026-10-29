import java.util.*;

public class binary {
    public static void convert(int a){
         int count=0;
        int i=0;
        while(a>0){
              
              count=count+(a%10)*(int)Math.pow(2,i);
              i++;
              a=a/10;

        }
        System.out.print(count);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number :");
        int a=sc.nextInt();
        convert(a);
       
        
    }
}
