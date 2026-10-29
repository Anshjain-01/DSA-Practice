
import java.util.ArrayList;

public class coins {
    public static int indian_coins(int den[],int value){
        int i=den.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        while(i>=0){
            if(value==0){
               break;
            }
             if(value>=den[i]){
                value-=den[i];
                list.add(den[i]);
                count++;
             }else{
                i--;
             }
        }
        System.out.println(list);
        return count;
    }
    public static void main(String[] args) {
        int den[]={1,2,5,10,20,50,100,500,2000};
        int value=1059;
        System.out.println("The minimum number of coins required for the value :"+" "+indian_coins(den,value));
    }
}
