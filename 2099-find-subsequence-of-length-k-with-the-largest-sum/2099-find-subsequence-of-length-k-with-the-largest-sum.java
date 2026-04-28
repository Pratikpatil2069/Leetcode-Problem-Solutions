class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[],int b[]){
                return a[1]-b[1];
            }
        });
         PriorityQueue<int[]>pq1=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{i,nums[i]});
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            pq1.add(pq.poll());
        }
        int arr[]=new int[k];
        int ind=0;
        while(!pq1.isEmpty()){
            int ans[]=pq1.poll();
            arr[ind++]=ans[1];
        }
       
        return arr;
    }
}