import java.util.*;
    public class set{
        public static void main(String args[]){
            HashSet<Integer> sett=new HashSet<>();
            sett.add(1);
            sett.add(2);
            sett.add(3);
            sett.add(4);
            sett.add(5);
            sett.add(6);
            System.out.println(sett);
            System.out.println(sett.contains(6));
            sett.remove(6);
            System.out.println(sett.size());
            Iterator it=sett.iterator();
            for(int i=0;i<sett.size();i++){
                if(it.hasNext()==true){
                    System.out.println(it.next());
                }
            }
        }
    }