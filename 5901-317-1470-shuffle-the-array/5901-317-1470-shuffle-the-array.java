class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int ind = 1;
        for (int i = 0; i < nums.length / 2; i++) {
            if (i == 0) {
                arr[i] = nums[i];

            } else {
                arr[i + ind] = nums[i];
                ind++;
            }
        }
        int ind2 = 1;
        for (int i = n; i < nums.length; i++) {
            arr[ind2] = nums[i];
            ind2 = ind2 + 2;
        }
        return arr;

    }
}