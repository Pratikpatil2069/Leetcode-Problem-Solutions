import java.util.Arrays; // Needed for sorting

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // Step 1: Sort the array to select smallest elements first
        Arrays.sort(nums); // \U0001f527 ADDED: sorting nums to allow greedy selection

        // Step 2: Create prefix sum array
        int arr[] = new int[nums.length];
        int ans[] = new int[queries.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }

        // Step 3: Process each query
        for (int i = 0; i < queries.length; i++) {
            int num = queries[i];
            int left = 0;
            int right = nums.length - 1;
            int res = 0; // \U0001f527 CHANGED: clearer variable name instead of flag

            // \U0001f527 CHANGED: Use binary search on prefix sum array instead of two-pointer shrinking
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] <= num) {
                    res = mid + 1; // store number of elements
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            ans[i] = res;
        }

        return ans;
    }
}
