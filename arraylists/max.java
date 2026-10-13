import java.util.*;
public class max {
    public static void main(String args[]){
        int m=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(3);
        list.add(1);
        for(int i=0;i<list.size();i++){
            if(m<list.get(i)){
                m=list.get(i);
            }
        }
        System.out.print(m);


    }
}
