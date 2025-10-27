class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        // XOR gives bits that differ between xor and k
        int diff = xor ^ k;
        
        // Count number of 1s (differing bits)
        return Integer.bitCount(diff);
    }
}
