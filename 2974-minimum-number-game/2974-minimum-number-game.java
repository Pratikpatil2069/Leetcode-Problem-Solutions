class Solution {
    public int[] numberGame(int[] nums) {
        int arr[]=new int [nums.length];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int ind=0;
        while(!(pq.isEmpty())){
            int num=pq.poll();
            arr[ind]=pq.poll();
            ind++;
            arr[ind]=num;
            ind++;
        }
        return arr;
    }
}