class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length / 2];
        int arr1[] = new int[nums.length / 2];
        int ind = 0;
        int ind1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[ind++] = nums[i];
            } else {
                arr1[ind1++] = nums[i];
            }
        }   
        ind=0;
        ind1=0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                nums[i] = arr[ind++];
                flag = false;
            } else {
                nums[i] = arr1[ind1++];
                flag = true;
            }

        }
        return nums;
    }
}