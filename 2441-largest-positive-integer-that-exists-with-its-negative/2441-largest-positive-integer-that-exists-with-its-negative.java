class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                num = num * (-1);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        Set<Integer> set = map.keySet();
        int flag = 0;
        for (Integer key : set) {
            if (map.get(key) >= 2) {
                if(list.contains(key)&&list.contains(-key)){
                max = Math.max(max, key);
                flag = 1;
                }
            }
        }
        if (flag == 1) {
            return max;
        } else {
            return -1;
        }
    }
}