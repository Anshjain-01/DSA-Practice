import java.util.*;
public class swapping{
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<6;i++){
            list.add(i);
        }
        int indx1=1;
        int indx2=3;
        System.out.println(list);
        swap(list, indx1, indx2);
        System.out.println(list);
    }
}
