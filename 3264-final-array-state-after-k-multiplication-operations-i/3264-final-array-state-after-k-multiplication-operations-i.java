class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
     PriorityQueue<int[]>pq=new PriorityQueue<int[]>(new Comparator<>(){
        public int compare(int[]a,int[]b){
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];

        }
     }) ;  
     for(int i=0;i<nums.length;i++){
        pq.add(new int[]{nums[i],i});
     }
     for(int i=0;i<k;i++){
        int[] num=pq.poll();
        num[0]=num[0]*multiplier;
        pq.add(num);
     }

     while(!pq.isEmpty()){
        int[]num=pq.poll();
        nums[num[1]]=num[0];
     }
     return nums;
    }
}