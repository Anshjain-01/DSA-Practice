import java.util.*;
public class count{
    // public static int say(String s){
    //     HashMap<Character,Integer> map=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         if(map.containsKey(s.charAt(i))){
    //                map.put(s.charAt(i),map.get(s.charAt(i))+1);
    //         }
    //         else{
    //             map.put(s.charAt(i),1);
    //         }
    //     }
        
    //     return 1;
    // }
    public static void main(String args[]){
        String s="tree";
      HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                   map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        // System.out.println(Collections.max(map.entrySet()));
        int[] count=new int[map.size()];
        int i=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
                count[i]=e.getValue();
                i++;
        }
        for(int p=0;p<count.length;p++){
           System.out.println(count[p]);
        }
        Arrays.sort(count);
        int p=count.length-1;
        StringBuilder sb=new StringBuilder("");
       for(Map.Entry<Character,Integer> e:map.entrySet()){
        if(count[p]==e.getValue()){
            sb.append(e.getKey());
            // map.remove(e.getKey());
            p--;
        }
      
       }
    System.out.println(sb.toString());
    }
}