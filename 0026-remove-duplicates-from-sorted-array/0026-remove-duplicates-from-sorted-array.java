class Solution {
    public int removeDuplicates(int[] nums) {
       int first=1;
       int last=0;
       int count=1;
       while(last<nums.length-1){
        if(nums[last]<nums[last+1]){
            nums[first++]=nums[last+1];
            count++;
        }
        last++;
       }
       return count;
    }
}