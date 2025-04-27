class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ind1=0;
        int ind2=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[ind1]=nums[i];
                ind1=ind1+2;
            }else{
                arr[ind2]=nums[i];
                ind2+=2;
            }
        }
        return arr;
    }
}