class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int ind1=0;
        int ind2=nums.length-1;
       
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                arr[ind1++]=nums[i];
            }
            if(nums[j]>pivot){
                arr[ind2--]=nums[j];
            }   
        }
        while(ind1<=ind2){
            arr[ind1++]=pivot;
        }
        return arr;
        
    }
}