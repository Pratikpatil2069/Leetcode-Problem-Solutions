class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> pq=new ArrayDeque<>();
        int []vis=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                pq.add(i);
                vis[i]=1;
                if(!bfs(graph,pq, vis)){
                    return false;
                }
            } 
        }
        
        return true;
    }
    private boolean bfs(int[][] graph, Queue<Integer>pq, int[] vis){
        while(!pq.isEmpty()){
            int size=pq.size();
            for(int i=0;i<size;i++){
                int node=pq.poll();
                for(int nbr:graph[node]){
                    if(vis[nbr]!=0){
                        if((vis[node]==1 && vis[nbr]==1) || (vis[node]==2 && vis[nbr]==2)){
                            return false;
                        }
                    }else{
                        if(vis[node]==1){
                            vis[nbr]=2;
                        }else{
                            vis[nbr]=1;
                        }
                        pq.add(nbr);
                    }
                }
            }
        }
        return true;
    }
}