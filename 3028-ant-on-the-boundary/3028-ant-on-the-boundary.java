class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int boundary=nums[0];
        int num=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                num=num+nums[i];
                if(num==boundary){
                    count++;
                }
            }else{
                num=num+nums[i];
                if(num==boundary){
                    count++;
                }
            }
        }
        return count;
    }
}