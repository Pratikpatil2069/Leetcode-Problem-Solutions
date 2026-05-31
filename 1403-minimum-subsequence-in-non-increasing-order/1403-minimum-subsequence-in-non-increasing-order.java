class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        List<Integer> ans = new ArrayList<>();
        int curr = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            curr += nums[i];
            ans.add(nums[i]);

            if (curr > total - curr) {
                break;
            }
        }

        return ans;
    }
}