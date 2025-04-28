class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                list.add(i);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (Math.abs(i - list.get(j)) <= k) {
                    list1.add(i);
                    break;
                }
            }
        }
        return list1;
    }
}