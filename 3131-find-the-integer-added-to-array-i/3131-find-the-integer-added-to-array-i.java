class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>max1){
                max1=nums1[i];
            }
            if(nums2[i]>max2){
                max2=nums2[i];
            }
        }
        return max2-max1;
    }
}