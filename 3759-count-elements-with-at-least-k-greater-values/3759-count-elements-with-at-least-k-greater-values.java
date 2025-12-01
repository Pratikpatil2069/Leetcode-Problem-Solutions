class Solution {
    public int countElements(int[] nums, int k) {
        if (k == 0) {
            return nums.length;
        }

        Arrays.sort(nums);
        int n = nums.length;
        int target = nums[n - k];  // k elements are strictly greater than target
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < target) {
                count++;
            }
        }

        return count;
    }
}

