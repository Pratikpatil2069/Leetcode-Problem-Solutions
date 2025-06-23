class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int or=num|nums[j];
                if((or & 1)==0){
                    return true;
                }
            }
        }
     return false;   
    }
}