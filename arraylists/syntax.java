import java.util.*;
public class syntax{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list);
        // System.out.println(list.get(1));
        // list.remove(3);
        // System.out.println(list);
        // list.set(2,4);
        // System.out.println(list);
        list.add(2,6);
        // System.out.println(list);
        // System.out.println(list.contains(6));
        if(list.contains(6)!=true){
            System.out.print("true");

        }
        else {
            System.out.print("false");

        }
        // System.out.println(list.contains(3));
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }


    }
}