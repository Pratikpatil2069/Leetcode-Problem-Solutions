class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        boolean visited[]=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            Queue<Integer>queue=new LinkedList<>();
            List<Integer>list=new ArrayList<>();
            queue.add(i);
            while(!queue.isEmpty()){
                int node=queue.poll();
                list.add(node);
                for(int nbr:graph[node]){
                    if(!visited[nbr]){
                        queue.add(nbr);
                        visited[nbr]=true;
                    }
                }
            }
            boolean flag=true;
            for(int node:list){
                if(graph[node].size()!=list.size()-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}