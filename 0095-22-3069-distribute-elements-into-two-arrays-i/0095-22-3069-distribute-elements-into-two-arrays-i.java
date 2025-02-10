class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(nums[0]);
        list1.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (list.get(list.size() - 1) > list1.get(list1.size() - 1)) {
                list.add(nums[i]);
            } else {
                list1.add(nums[i]);
            }

        }
        for (int j = 0; j < list.size(); j++) {
            nums[j] = list.get(j);
        }
        for (int k = 0; k < list1.size(); k++) {
            nums[list.size() + k] = list1.get(k);
        }
        return nums;
    }
}