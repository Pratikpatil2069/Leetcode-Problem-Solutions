class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        for(int i=0;i<intervals.length;i++){
            pq.add(intervals[i]);
        }
        
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            if(pq1.size()==0){
                pq1.add(arr[1]);
            }else{
                if(pq1.peek()<arr[0]){
                    pq1.poll();
                }
                pq1.add(arr[1]);
            }
    
        }
        return pq1.size();
    }
}