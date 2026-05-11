class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<long[]>pq=new PriorityQueue<>((a,b)->(int)(a[0]-b[0]));
        for(int i=0;i<workerTimes.length;i++){
            pq.add(new long[]{(long)workerTimes[i],(long)1,(long)workerTimes[i]});
        }
        long sec=0;
        while(!pq.isEmpty()){
            long arr[]=pq.poll();
            mountainHeight--;
            long count=arr[0]+(arr[2]*(arr[1]+1));
            pq.add(new long[]{count,arr[1]+1,arr[2]});
            if(mountainHeight<=0){
                break;
            }
        }
        while(!pq.isEmpty()){
            long ans[]=pq.poll();
            long sum=ans[0]-(ans[1]*ans[2]);
            sec=Math.max(sec,sum);
        }
        return sec;
    }
}