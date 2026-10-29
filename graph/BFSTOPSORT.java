import java.util.*;
public class BFSTOPSORT {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void Indegree(ArrayList<Edge>[] graph,int[] ind){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                ind[e.dest]++;
            }
        }
    }
    public static void TopSort(ArrayList<Edge>[] graph){
             int[] ind=new int[graph.length];
             Queue<Integer> q=new LinkedList<>();
             Indegree(graph, ind);
             for(int i=0;i<ind.length;i++){
                if(ind[i]==0)q.add(i);
             }
             while(!q.isEmpty()){
                int curr=q.remove();
                 System.out.print(curr+" ");
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    ind[e.dest]--;
                    if(ind[e.dest]==0)q.add(e.dest);
                }
             }
    }
    public static void main(String[] args) {
          int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        TopSort(graph);
    }   
}
