import java.util.*;
public class mapping {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("China",150);
        map.put("Bhutan",10);
        System.out.println(map);
        for(Map.Entry<String,Integer> e: map.entrySet()){
                System.out.println(e.getKey());
                System.out.println(e.getValue());
        }
         Set <String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("China");
        System.out.println(map);
    }
}
