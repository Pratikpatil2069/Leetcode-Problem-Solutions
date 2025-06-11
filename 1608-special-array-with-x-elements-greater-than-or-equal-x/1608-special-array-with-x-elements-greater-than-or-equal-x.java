import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i <= nums.length; i++) {
            int left = 0;
            int right = nums.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (i > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            
            if (i == nums.length - left) {
                return i;
            }
        }

        return -1;
    }
}
