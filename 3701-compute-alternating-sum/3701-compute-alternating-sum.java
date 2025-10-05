class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(flag){
                sum=sum+nums[i];
                flag=false;
            }else{
                sum=sum-nums[i];
                flag=true;
            }
        }
        return sum;
    }
}