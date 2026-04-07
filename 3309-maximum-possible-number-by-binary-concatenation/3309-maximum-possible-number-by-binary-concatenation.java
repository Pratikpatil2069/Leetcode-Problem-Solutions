class Solution {
    
    private int getBits(int x) {
        return Integer.toBinaryString(x).length();
    }
    
    private int concat(int a, int b) {
        int lenB = getBits(b);
        return (a << lenB) | b;
    }
    
    public int maxGoodNumber(int[] nums) {
        int ans = 0;
        
        
        int[][] perms = {
            {nums[0], nums[1], nums[2]},
            {nums[0], nums[2], nums[1]},
            {nums[1], nums[0], nums[2]},
            {nums[1], nums[2], nums[0]},
            {nums[2], nums[0], nums[1]},
            {nums[2], nums[1], nums[0]}
        };
        
        for (int[] p : perms) {
            int val = concat(concat(p[0], p[1]), p[2]);
            ans = Math.max(ans, val);
        }
        
        return ans;
    }
}