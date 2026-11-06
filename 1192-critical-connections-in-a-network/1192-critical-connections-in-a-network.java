class Solution {
    int count=0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<connections.size();i++){
            List<Integer>list=connections.get(i);
            graph[list.get(0)].add(list.get(1));
            graph[list.get(1)].add(list.get(0));
        }
        int low[]=new int[n];
        int curr[]=new int[n];
        int vis[]=new int[n];

        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(graph, i,-1,low, curr, vis,ans);
            }
        }
        
        return ans;
        
    }
    public void dfs(List<Integer>graph[], int node,int parent, int[] low, int[] curr, int[] vis,List<List<Integer>>ans){
        vis[node]=1;
        low[node]=count;
        curr[node]=count;
        count++;
        for(int nbr:graph[node]){
            if(nbr==parent){
                continue;
            }
            if(vis[nbr]==0){
                dfs(graph, nbr,node, low, curr, vis,ans);
                low[node]=Math.min(low[node],low[nbr]);
                if(low[nbr]>curr[node]){
                    ArrayList<Integer>subList=new ArrayList<>();
                    subList.add(node);
                    subList.add(nbr);
                    ans.add(subList);
                }
            }else{
                low[node]=Math.min(low[node],curr[nbr]);
            }
        }
    }

}