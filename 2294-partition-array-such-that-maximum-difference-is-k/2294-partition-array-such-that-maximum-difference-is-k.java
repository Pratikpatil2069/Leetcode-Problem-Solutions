class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;
        int ind=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[ind]-nums[i]>k){
                count++;
                ind=i;
                i++;
            }
        }
        return count;
    }
}