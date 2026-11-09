
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        int vist[] = new int[graph.length];
        int pathVist[] = new int[graph.length];

        for(int i=0; i<graph.length; i++){
            if(dfs(graph,i,vist,pathVist)){
                ans.add(i);
            }
        }
        return ans;
    }

    private boolean dfs(int[][] graph,int node,int[] vist,int[] pathVist){

        if(vist[node]==1){
            return pathVist[node]==0;
        }

        vist[node]=1;
        pathVist[node]=1;

        for(int nbr: graph[node]){
            if(vist[nbr]==0){
                if(!dfs(graph,nbr,vist,pathVist)){
                    return false;
                }
            }else{
                if(pathVist[nbr]==1){
                    return false;
                }
            }
        }

        pathVist[node]=0;
        return true;
    }
}
