class Solution {
    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;
            while (num != 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            nums[i] = sum;
        }
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;

    }
}