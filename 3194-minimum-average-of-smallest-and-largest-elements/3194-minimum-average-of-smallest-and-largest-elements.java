class Solution {
    public double minimumAverage(int[] nums) {
       Arrays.sort(nums);
       int left=0;
       int right=nums.length-1;
        double result=Double.MAX_VALUE;
       while(left<right){
        double sum=(double)(nums[left]+nums[right])/2;
        result=Math.min(result,sum);
        left++;
        right--;
       }
       return result;
    }
}