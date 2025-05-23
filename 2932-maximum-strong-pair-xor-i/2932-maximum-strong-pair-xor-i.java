
class Solution {
    public int maximumStrongPairXor(int[] nums) {
         int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    max=Math.max(max,nums[i]^nums[j]);
                }
            }
        }
        return max;
    }
}