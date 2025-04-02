class Solution {
    public long maximumTripletValue(int[] nums) {
       long max=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
               for(int k=j+1;k<nums.length;k++){
                if(nums[i]<0 && nums[j]<0 && nums[k]<0){
                    return 0;
                }
                max=Math.max((long)(nums[i]-nums[j])*(long)nums[k],max);
               }
            }
        }
        return max;
    }
}