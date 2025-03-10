class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg++;
            } else if (nums[i] == 0) {
                zero++;
            }
        }
        if (zero > 0) {
            return 0;
        }
        if (neg % 2 == 1) {
            return -1;
        }
        return 1;
    }
}