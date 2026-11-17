class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>graph[]=new ArrayList[numCourses];
        int indeg[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }   
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indeg[prerequisites[i][0]]++;
        }
        Queue<Integer>pq=new ArrayDeque<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                pq.add(i);
            }
        }
        int ans[]=new int[indeg.length];
        int ind=0;
        while(!pq.isEmpty()){
            int node=pq.poll();
            ans[ind++]=node;
            for(int nbr:graph[node]){
                indeg[nbr]--;
                if(indeg[nbr]==0){
                    pq.add(nbr);
                }
            }
            numCourses--;
        }
        if(numCourses==0){
            return ans;
        }else{
            return new int[]{};
        }
        
    }
}