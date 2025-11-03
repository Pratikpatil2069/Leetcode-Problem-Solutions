class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = l[i]; j <= r[i]; j++) {
                list1.add(nums[j]);
            }
            Collections.sort(list1);
            boolean flag = true;
            int dif = list1.get(1) - list1.get(0);
            for (int k = 0; k < list1.size() - 1; k++) {
                if ((list1.get(k + 1) - list1.get(k)) != dif) {
                    flag = false;
                    break;
                }
            }
            list.add(flag);

        }
        return list;
    }

}