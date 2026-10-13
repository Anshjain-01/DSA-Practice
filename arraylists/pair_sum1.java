import java.util.*;
public class pair_sum1 {
    public static boolean pair_sum(ArrayList<Integer> list, int target){
        int i=0;
        int j=list.size()-1;
        while(i<j){
        if(list.get(i)+list.get(j)==target){
            return true;
        }
        else if((list.get(i)+list.get(j))>target){
            j--;
        }
        else{
            i++;
        }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int target=50;
        for(int i=1;i<6;i++){
            list.add(i);
        }
        System.out.print(pair_sum(list, target));


    }
}
