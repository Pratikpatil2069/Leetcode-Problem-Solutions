class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            boolean found = false;
            
            for (int target = 0; target < num; target++) {
                if ((target | (target + 1)) == num) {
                    ans[i] = target;
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}
