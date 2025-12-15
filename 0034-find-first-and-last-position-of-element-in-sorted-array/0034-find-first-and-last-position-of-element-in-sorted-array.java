class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                int ind=mid;
                while( ind>-1 && nums[ind]==target){
                    ind--;
                }
                int start=ind+1;
                ind=mid;
                 while( ind<nums.length && nums[ind]==target){
                    ind++;
                }
                return new int[]{start,ind-1};

            }
            if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}