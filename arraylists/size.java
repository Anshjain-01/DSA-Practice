import java.util.*;
public class size {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i<=5;i++){
        list.add(i);
       }
       System.out.println(list.size());
       System.out.println(list);
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
    //    reverse of ArrayList
    for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
    }


    }
}
