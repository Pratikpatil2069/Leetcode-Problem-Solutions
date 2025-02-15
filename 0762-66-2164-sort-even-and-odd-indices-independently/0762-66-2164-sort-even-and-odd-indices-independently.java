class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                list.add(nums[i]);
            } else {
                list1.add(nums[i]);
            }
        }
        Collections.sort(list);
        Collections.sort(list1);
        int ind = 0;
        int ind1 = 1;
        for (int i = 0; i < list1.size(); i++) {
            nums[ind] = list1.get(i);
            ind = ind + 2;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            nums[ind1] = list.get(i);
            ind1 = ind1 + 2;
        }
        return nums;
    }
}