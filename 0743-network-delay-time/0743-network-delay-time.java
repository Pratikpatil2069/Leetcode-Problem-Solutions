class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<int[]> graph[]=new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            graph[u].add(new int[]{v,w});
        }
        int dist[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dist[i]=Integer.MAX_VALUE;
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        dist[k]=0;
        pq.add(new int[]{0,k});
        
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
           
            ArrayList<int[]> list=graph[arr[1]];
            for(int i=0;i<list.size();i++){
                int arr1[]=list.get(i);
                int v=arr1[0];
                int w=arr1[1];
                if(dist[v]>w+arr[0]){
                    dist[v]=w+arr[0];
                    pq.add(new int[]{w+arr[0],v});
                }
            }
        }
        int min=0;
        for(int i=1;i<dist.length;i++){
            if(min<dist[i]){
                min=dist[i];
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}