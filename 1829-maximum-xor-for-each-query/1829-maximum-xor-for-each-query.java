class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int ans[]=new int[nums.length];
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]^nums[i];
        }
        int k=(int)Math.pow(2,maximumBit)-1;
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[arr.length-1-i]^k;
        }
       return ans;
        
    }
}