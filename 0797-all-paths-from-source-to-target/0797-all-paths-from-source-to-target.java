class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>list=new ArrayList<>();
        ArrayList<Integer> arr[]=new ArrayList[graph.length];
        for(int i=0;i<graph.length;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                arr[i].add(graph[i][j]);
            }
        }
        
        ArrayList<Integer>subList=new ArrayList<>();
        subList.add(0);
        allPaths(arr,0,graph.length-1,list,subList);
        return list;
    }
    public void allPaths(List<Integer>arr[],int curr,int src, List<List<Integer>>list,List<Integer>subList){
        if(curr==src){
            list.add(new ArrayList<>(subList));
            return;
        }
       

        for(int node:arr[curr]){
                subList.add(node);
                allPaths(arr,node,src,list,subList);
                subList.remove(subList.size()-1); 
        }
    }
}