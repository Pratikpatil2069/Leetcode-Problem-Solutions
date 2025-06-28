class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        Boolean flag=false;
        for(int i=0;i<nums.length;i++){
            int or=0;
            for(int j=i;j<nums.length;j++){
                 or|=nums[j];
                if(or>=k){
                    min=Math.min(min,(j-i+1));
                    flag=true;
                    break;
                }
            }
        }
       
        return flag ? min : -1;
    }
}