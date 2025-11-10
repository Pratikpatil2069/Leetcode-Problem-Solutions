class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            count+=(max-nums[i]);
        }
        return count;
    }
}