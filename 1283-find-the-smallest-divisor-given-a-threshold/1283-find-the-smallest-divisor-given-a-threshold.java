class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int num:nums){
            right=Math.max(num,right);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isThreshold(nums,mid,threshold)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean isThreshold(int nums[],int div,int max){
        int sum=0;
        for(int num:nums){
            sum=sum+((num/div)+((num%div==0)?0:1));
        }
        return sum<=max;
    }
}