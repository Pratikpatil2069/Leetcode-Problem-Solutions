class Solution {
    public void rotate(int[] nums, int k) {
       if(k!=0){
        k=k%nums.length;
        reverse1(nums,0,nums.length-1);
        reverse1(nums,0,k-1);
        reverse1(nums,k,nums.length-1);
       }
        
    }
    public void reverse1( int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

    }
    
}