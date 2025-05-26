class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int num=nums1[i];
            int ind=-1;
            for(int j=0;j<nums2.length;j++){
                if(num==nums2[j]){
                    ind=j;
                    break;
                }
            }
            for(int k=ind;k<nums2.length;k++){
                if(num<nums2[k]){
                    nums1[i]=nums2[k];
                    break;
                }
            }
            if(nums1[i]==num){
                nums1[i]=-1;
            }
    }
       return nums1; 
    }
}