class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = left; i <= right; i++) {
            set.add(i);
        }
        for (int i = 0; i < ranges.length; i++) {
            int num = ranges[i][0];
            for (int j = num; j <= ranges[i][1]; j++) {
                if (set.contains(j)) {
                    set.remove(j);
                }
            }
        }
        if (set.isEmpty()){
            return true;
        }
        return false;
    }
}