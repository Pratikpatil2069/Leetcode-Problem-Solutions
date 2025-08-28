class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int num=nums[i];
            int ind=i;
            for(int j=i+1;j<nums.length;j++){
                if(num>nums[j]){
                   num=nums[j];
                   ind=j;
                }
            }
            int temp=nums[i];
            nums[i]=num;
            nums[ind]=temp;
        }
        
    }
}