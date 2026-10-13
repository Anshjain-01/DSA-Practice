import java.util.*;
public class sorting {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(4);
        System.out.println(list);
        // This is for sorting in ascending order
        Collections.sort(list);
        System.out.println(list);
        // This is for sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


    }
}
