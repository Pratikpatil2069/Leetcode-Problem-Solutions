class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            visited[i]=true;
        }
        
            Queue<Integer>queue=new LinkedList<>();
            queue.add(0);
            visited[0]=false;
            while(!queue.isEmpty()){
                int node=queue.poll();
                for(int nbr:rooms.get(node)){
                    if(visited[nbr]){
                        visited[nbr]=false;
                        queue.add(nbr);
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(visited[i]){
                    return false;
                }
            }
     return true;   
    }
}