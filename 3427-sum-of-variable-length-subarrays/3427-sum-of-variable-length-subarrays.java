class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            int end=i;
            int sum1=0;
            while(start!=end+1){
                sum1=sum1+nums[start];
                start++;
            }
            sum=sum+sum1;
        }
        return sum;
    }
}