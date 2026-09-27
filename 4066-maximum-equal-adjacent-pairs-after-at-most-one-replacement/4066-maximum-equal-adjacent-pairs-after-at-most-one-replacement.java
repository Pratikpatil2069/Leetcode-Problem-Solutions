class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } 
        }
        
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                String str1 = nums[i] + "#" + nums[i + 1];
                String str2 = nums[i + 1] + "#" + nums[i];

                map.put(str1, map.getOrDefault(str1, 0) + 1);
                map.put(str2, map.getOrDefault(str2, 0) + 1);
            }
        }
        int max=0;
        for(int val:map.values()){
            max=Math.max(max,val);
        }
        return max+count;
    }
}