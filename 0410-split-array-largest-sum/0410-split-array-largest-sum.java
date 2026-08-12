class Solution {
    public int splitArray(int[] nums, int k) {
        int high=0;
        int low=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
            low=Math.max(nums[i],low);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=1;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>mid){
                    sum=nums[i];
                    count++;
                }
            }
            if(count<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}