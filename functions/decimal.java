

public class decimal {
    public static void main(String args[]){
    int num=6;
    int count=0;
    int rem;
    while(num>0){
        if(num%2==0){
            rem=0;
        }
        else{
            rem=1;
        }
        count=count*10+rem;
        num=num/2;
    }
    System.out.print(count);
}
}
