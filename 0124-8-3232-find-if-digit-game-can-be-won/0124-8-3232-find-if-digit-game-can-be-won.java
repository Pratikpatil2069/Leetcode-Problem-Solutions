class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 9) {
                sum = sum + nums[i];

            } else {
                sum1 = sum1 + nums[i];
            }
        }
        if (sum1 == sum) {
            return false;
        } else {
            return true;
        }

    }
}