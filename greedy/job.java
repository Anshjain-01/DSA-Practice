import java.util.*;
public class job {
    public static int sequence(int jobs[][]){
        int mat[][]=new int[jobs.length][3];
        for(int i=0;i<jobs.length;i++){
             mat[i][0]=i;
             mat[i][1]=jobs[i][0];
             mat[i][2]=jobs[i][1];
        }
        Arrays.sort(mat,(a,b)->a[1]-b[1]);
        ArrayList<Integer> list=new ArrayList<>();
        int ans=0;
        int max=mat[0][2];
        int j=mat[0][1];
        int idx=mat[0][0];
        for(int i=1;i<jobs.length;i++){
            if(j==mat[i][1]){
                if(max<mat[i][2]){
                    idx=mat[i][0];
                    max=mat[i][2];
                }
            }else{
                ans+=max;
                list.add(idx);
               idx=mat[i][0];
                max=mat[i][2];
                j=mat[i][1];
            }
        }
        ans+=max;
        list.add(idx);
        for(int i=0;i<list.size();i++){
            System.out.print("Job"+""+(char)(list.get(i)+65)+" ");
        }
        System.out.println();
        return ans;
    }
    static class Zob{
        int deadline;
        int profit;
        int id;

        public Zob(int i,int d,int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }
    }
    public static void main(String[] args) {
        int jobs[][]={{4,20},{1,10},{1,40},{1,30},{2,20},{2,60},{2,10},{4,50}};
        // System.out.println(sequence(jobs));

        ArrayList<Zob> list=new ArrayList<>();
        for(int i=0;i<jobs.length;i++){
            list.add(new Zob(i,jobs[i][0],jobs[i][1]));
        }

        Collections.sort(list,(obj1,obj2)->obj2.profit-obj1.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<list.size();i++){
            Zob curr=list.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max jobs =" +seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
}
