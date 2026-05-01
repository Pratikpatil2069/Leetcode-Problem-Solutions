class Solution {
    public long findScore(int[] nums) {
        long score=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        int mark[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            if(mark[arr[1]]==0){
                score+=arr[0];
                mark[arr[1]]=1;
                if(arr[1]+1<mark.length){
                    mark[arr[1]+1]=1;
                }
                if(arr[1]-1>=0){
                    mark[arr[1]-1]=1;
                }
            }
        }
        return score;
    }
}