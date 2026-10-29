import java.util.*;
public class Flight {
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
    public static void createGraph(int flight[][],ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flight.length;i++){
            int src=flight[i][0];
            int dest=flight[i][1];
            int wt=flight[i][2];
            Edge e=new Edge(src,dest,wt);
            graph[src].add(e);
        }
    }
    static class Info{
        int ver;
        int cost;
        int stops;
        public Info(int v,int c,int s){
            this.ver=v;
            this.cost=c;
            this.stops=s;
        }
    }
    public static int cheapestFlight(int n,int flight[][],int src,int dest,int k){
           ArrayList<Edge> graph[]=new ArrayList[n];
           createGraph(flight, graph);
           int dist[]=new int[n];
           for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
           }
           Queue<Info> q=new LinkedList<>();

           q.add(new Info(src,0,0));
           while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.ver].size();i++){
                Edge e=graph[curr.ver].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                
                if(curr.cost+wt<dist[v] && curr.stops<=k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
           }
           if(dist[dest]==Integer.MAX_VALUE){
                 return -1;
           }else{
            return dist[dest];
           }
            
    }
    public static void main(String[] args) {
    //       int v=7;
    // ArrayList<Edge>[] graph=new ArrayList[v];
    // for(int i=0;i<v;i++){
    //     graph[i]=new ArrayList<>();
    // }
    // graph[0].add(new Edge(0,1,7));
    // graph[0].add(new Edge(0,4,5));
    // graph[1].add(new Edge(1,0,7));
    // graph[1].add(new Edge(1,4,9));
    // graph[1].add(new Edge(1,2,8));
    // graph[1].add(new Edge(1,3,7));
    // graph[2].add(new Edge(2,1,8));
    // graph[2].add(new Edge(2,3,5));
    // graph[3].add(new Edge(3,1,7));
    // graph[3].add(new Edge(3,2,5));
    // graph[3].add(new Edge(3,4,15));
    // graph[3].add(new Edge(3,5,8));
    // graph[3].add(new Edge(3,6,9));
    // graph[4].add(new Edge(4,0,5));
    // graph[4].add(new Edge(4,1,9));
    // graph[4].add(new Edge(4,3,15));
    // graph[4].add(new Edge(4,5,6));
    // graph[5].add(new Edge(5,3,8));
    // graph[5].add(new Edge(5,4,6));
    // graph[5].add(new Edge(5,6,11));
    // graph[6].add(new Edge(6,3,9));
    // graph[6].add(new Edge(6,5,11));
     int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
     int src=0,dest=3,k=1;
     int n=4;
      System.out.println(cheapestFlight(n,flight,src,dest,k));
    }
}
