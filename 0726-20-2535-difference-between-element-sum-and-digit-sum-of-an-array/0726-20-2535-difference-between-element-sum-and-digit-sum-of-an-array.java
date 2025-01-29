class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 = sum1 + nums[i];
            int num = nums[i];
            while (num != 0) {
                sum2 = sum2 + num % 10;
                num = num / 10;
            }
        }
        return sum1 - sum2;

    }
}