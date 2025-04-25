class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int ind=0;
        int ind1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[ind1]=nums[i];
                ind1++;
            }else{
                arr[(arr.length-1)-ind]=nums[i];
                ind++;
            }
        }
        return arr;
    }
}