import java.util.*;
public class multidim {
    public static void main(String args[]){
        // ArrayList<ArrayList<Integer>> main_list=new ArrayList<>();
        // ArrayList<Integer> list1=new ArrayList<>();
        // list1.add(1); list1.add(2);
        // main_list.add(list1);
        // ArrayList<Integer> list2=new ArrayList<>();
        // list2.add(3); list2.add(4);
        // main_list.add(list2);
        // for(int i=0;i<main_list.size();i++){
        //     ArrayList<Integer> curr_list=main_list.get(i);
        //     for(int j=0;j<curr_list.size();j++){
        //         System.out.print(curr_list.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(main_list);
        ArrayList<ArrayList<Integer>> list_numbers=new ArrayList<>();
        ArrayList<Integer> list_2=new ArrayList<>();
        for(int i=1;i<6;i++){
            list_2.add(2*i);
        }
        list_numbers.add(list_2);
         ArrayList<Integer> list_3=new ArrayList<>();
        for(int i=1;i<6;i++){
            list_3.add(3*i);
        }
        list_numbers.add(list_3);
         ArrayList<Integer> list_4=new ArrayList<>();
        for(int i=1;i<6;i++){
            list_4.add(4*i);
        }
        list_numbers.add(list_4);
        for(int i=0;i<list_numbers.size();i++){
            ArrayList<Integer> currlist=list_numbers.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        



    }
}
