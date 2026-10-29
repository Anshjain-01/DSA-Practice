import java.util.*;
public class activity{

    public static int selection(int start[], int end[]){
          int count=1;
          ArrayList<Integer> list=new ArrayList<>();
          int st=1;
          int ep=0;
          list.add(0);
          while(st<start.length && ep<end.length-1){
            if(end[ep]<=start[st]){
                count++;
                ep++;
                list.add(st);
            }
            st++;
          }
        System.out.println(list);
     return count;
    }
    public static int activity_selection(int start[], int end[]){
        int maxAct=1;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        int endLast=end[0];
        for(int i=0;i<end.length;i++){
                if(start[i]>=endLast){
                    maxAct++;
                    list.add(i);
                    endLast=end[i];
                }
        }
        System.out.println(list);
        return maxAct;

    }
    public static void sort(int start[],int end[]){
        int ans[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            ans[i][0]=i;
            ans[i][1]=start[i];
            ans[i][2]=end[i];
        }
        Arrays.sort(ans, Comparator.comparingDouble(o->o[2]));
        int maxAct=1;
        int lastEnd=ans[0][2];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(ans[0][0]);
        for(int i=1;i<ans.length;i++){
            if(ans[i][1]>=lastEnd){
                maxAct++;
                list.add(ans[i][0]);
                lastEnd=ans[i][2];
            }
        }
        System.out.println(list);
        System.out.println("The maximum activity can be performed"+" "+maxAct);
        // for(int i=0;i<ans.length;i++){
        //     for(int j=0;j<ans[0].length;j++){
        //         System.out.print(ans[i][j]+" ");
        //     }
        //     System.out.println();
        // }
      
    }
    public static void main(String args[]){
       int start[]={5,3,0,5,1,8};
       int end[]={7,4,6,9,2,9};
    //    System.out.println("The maximum activity can be performed:"+" "+selection(start,end));
    //    System.out.println("The maximum activity can be performed"+" "+activity_selection(start, end));
   sort(start, end);
    }
}