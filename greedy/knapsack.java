import java.util.*;
public class knapsack{
    public static int fractional(int w[],int v[],int weight){
        double ratio[][]=new double[w.length][2];
        for(int i=0;i<w.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=v[i]/(double)w[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int value=0;
        int capacity=weight;
        for(int i=ratio.length-1;i>=0;i--){
            if(capacity==0){
                return value;
            }
            if(capacity>=w[(int)ratio[i][0]]){
                value+=v[(int)ratio[i][0]];
                capacity-=w[(int)ratio[i][0]];
            }
            else{
                value+=capacity*ratio[i][1];
                break;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int w[]={10,20,30};
        int v[]={60,100,120};
        int weight=50;
        System.out.println("The maximum capacity of knapsack is:"+" "+fractional(w, v, weight));
    }
}