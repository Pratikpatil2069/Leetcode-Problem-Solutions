class Solution {
    public int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int flag = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        if (min > nums[i] + nums[j] + nums[k]) {
                            min = nums[i] + nums[j] + nums[k];
                            flag = 1;
                        }
                    }
                }
            }
        }
        if (flag == 1) {
            return min;
        } else {
            return -1;
        }
    }
}