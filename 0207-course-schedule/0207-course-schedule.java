class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>graph[]=new ArrayList[numCourses];
        int indeg[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
            indeg[prerequisites[i][1]]++;
        }
        Queue<Integer>pq=new ArrayDeque<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                pq.add(i);
            }
        }
        while(!pq.isEmpty()){
            int node=pq.poll();
            for(int nbr:graph[node]){
                indeg[nbr]--;
                if(indeg[nbr]==0){
                    pq.add(nbr);
                }
            }
            numCourses--;

        }
        return numCourses==0;
    }
}