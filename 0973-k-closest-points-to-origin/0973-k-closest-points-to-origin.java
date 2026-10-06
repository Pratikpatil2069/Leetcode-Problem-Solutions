class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<ArrayList<Integer>>pq=new PriorityQueue<>((a,b)->a.get(2)-b.get(2));  
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int dist=x*x+y*y;
            ArrayList<Integer>list=new ArrayList<>();
            list.add(x);
            list.add(y);
            list.add(dist);
            pq.add(list);
        }
        int ans[][]=new int[k][2];
        while(k-->0){
            ArrayList<Integer>subList=pq.poll();
            
            ans[k][0]=subList.get(0);
            ans[k][1]=subList.get(1);
            
        }
        return ans;
    }
}