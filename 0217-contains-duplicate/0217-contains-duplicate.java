class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length-1;i++){
        //     int num=nums[i];
        //     int ind=i;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]>num){
        //             num=nums[j];
        //             ind=j;
        //         }
        //     }
        //     int temp=nums[i];
        //     nums[i]=nums[ind];
        //     nums[ind]=temp;
        // }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}