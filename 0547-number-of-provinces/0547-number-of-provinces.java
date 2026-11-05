class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length+1;
        List<Integer>graph[]=new ArrayList[n];
        for(int i=1;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(isConnected[i][j]==1){
                    graph[i+1].add(j+1);
                }
            }
        }
        int vis[]=new int[n];
        int count=0;
        for(int i=1;i<n;i++){
            if(vis[i]==0){
                count++;
                dfs(graph,i,vis);
            }
        }
        return count;
    }
    public void dfs(List<Integer>graph[], int i, int[] vis){
        vis[i]=1;

        for(int nbr:graph[i]){
            if(vis[nbr]==0){
                dfs(graph, nbr, vis);
            }
        }
    }
}