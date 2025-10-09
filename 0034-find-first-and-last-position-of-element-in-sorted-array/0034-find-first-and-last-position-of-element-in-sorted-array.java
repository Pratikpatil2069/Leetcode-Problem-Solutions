class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int arr[] = { -1, -1 };
        boolean flag = true;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int start=mid;
                int end=mid;
                while(start>0 && nums[start-1]==target){
                    start--;
                }
                 while(end<nums.length-1 && nums[end+1]==target){
                    end++;
                }
                arr[0]=start;
                arr[1]=end;
                return arr;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return arr;
    }
}