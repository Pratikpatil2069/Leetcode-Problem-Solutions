class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=1;
        int count=0;
        int or=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
           
                while((or&nums[i])!=0){
                    or^=nums[left];
                    left++;
                    count--;
                }
                or |= nums[i];
                count++;
                max=Math.max(count,max);
            
        }
        return Math.max(max,count);
    }
}