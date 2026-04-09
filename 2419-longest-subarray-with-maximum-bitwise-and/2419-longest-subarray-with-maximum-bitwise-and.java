class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];
        int length=0;
        int maxLength=0;
        int ind=0;
        for(int i=1;i<nums.length;i++){
           if(max<nums[i]){
            max=nums[i];
            ind=i;
           }
        }
        for(int i=ind;i<nums.length;i++){
            if(max==nums[i]){
                length++;
            }else{
                maxLength=Math.max(maxLength,length);
                length=0;
            }
        }
        return Math.max(maxLength,length);
    }
}