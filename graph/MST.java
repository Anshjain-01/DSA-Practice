import java.util.*;
public class MST{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static class Pair implements Comparable<Pair>{
        int ver;
        int cost;

        public Pair(int v,int c){
           this.ver=v;
           this.cost=c;
        }
        @Override 
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
   public static int Prims(ArrayList<Edge>[] graph){
    boolean[] vis=new boolean[graph.length];
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    pq.add(new Pair(0,0));
    int cost=0;
    while(!pq.isEmpty()){
        Pair curr=pq.remove();
        if(!vis[curr.ver]){
            vis[curr.ver]=true;
            cost+=curr.cost;
            for(int i=0;i<graph[curr.ver].size();i++){
                Edge e=graph[curr.ver].get(i);
                pq.add(new Pair(e.dest,e.wt));
            }
        }
    }
    return cost;
   }
    public static void main(String[] args) {
        int v=4;
    ArrayList<Edge>[] graph=new ArrayList[v];
    for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0,1,10));
    graph[0].add(new Edge(0,2,15));
    graph[0].add(new Edge(0,3,30));
    graph[1].add(new Edge(1,3,40));
    graph[2].add(new Edge(2,3,50));
    
    System.out.println(Prims(graph));

}
}