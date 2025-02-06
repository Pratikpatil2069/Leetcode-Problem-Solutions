class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            int max = 0;
            while (num != 0) {
                int re = num % 10;
                count++;
                num = num / 10;
                max = Math.max(re, max);
            }
            int n = 0;
            for (int j = 0; j < count; j++) {
                n = n * 10 + max;
            }

            arr[i] = n;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}