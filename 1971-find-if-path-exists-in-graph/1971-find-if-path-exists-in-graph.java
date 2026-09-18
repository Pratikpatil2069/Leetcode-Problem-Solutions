class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>subList=new ArrayList<>();
            list.add(subList);
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            list.get(v1).add(v2);
            list.get(v2).add(v1);
        }
       boolean visited[]=new boolean[n];
       return isPath(list, source, destination, visited);
    }
    public boolean isPath(ArrayList<ArrayList<Integer>>list, int src, int dest, boolean[] visited){
        if(src==dest){
            return true;
        }
        visited[src]=true;

        for(int nbr:list.get(src)){
            if(!visited[nbr]){
                if(isPath(list,nbr,dest,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}