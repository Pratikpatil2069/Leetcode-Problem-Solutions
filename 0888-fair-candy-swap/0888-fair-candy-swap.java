class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumx = 0;
        int sumy = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumx = sumx + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumy = sumy + bobSizes[i];
        }
        Set<Integer> set = new HashSet<>();
        for (int i : aliceSizes) {
            set.add(i);
        }
        int target = (sumx - sumy) / 2;
        for (int i = 0; i < bobSizes.length; i++) {
            int num = target + bobSizes[i];
            if (set.contains(num)) {
                return new int[] { num,bobSizes[i]};
            }
        }
        return new int[] { -1, -1 };
    }
}