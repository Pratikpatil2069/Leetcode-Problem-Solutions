class Solution {
    public int minCostConnectPoints(int[][] points) {
        int v=points.length;
        ArrayList<ArrayList<Integer>>graph[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<v-1;i++){
            int x[]=points[i];
            for(int j=i+1;j<v;j++){
                ArrayList<Integer>list1=new ArrayList<>();
                int y[]=points[j];
                int w=Math.abs(x[0]-y[0])+Math.abs(x[1]-y[1]);
                list1.add(i);
                list1.add(j);
                list1.add(w);
                graph[i].add(new ArrayList<>(list1));
                list1.clear();
                list1.add(j);
                list1.add(i);
                list1.add(w);
                graph[j].add(new ArrayList<>(list1));
            }
        }
        PriorityQueue<ArrayList<Integer>>pq=new PriorityQueue<>((a,b)->Integer.compare(a.get(2),b.get(2)));
        int vist[]=new int[v];
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        pq.add(list);
        int minDist=0;
        while(!pq.isEmpty()){
            ArrayList<Integer>subList=pq.poll();
            if(vist[subList.get(1)]==1){
                continue;
            }
            minDist+=subList.get(2);
            vist[subList.get(1)]=1;
            
            for(ArrayList<Integer> arr:graph[subList.get(1)]){
                if(vist[arr.get(1)]!=1){
                    pq.add(arr);
                }
            }
            
        }
        return minDist;
    }
}