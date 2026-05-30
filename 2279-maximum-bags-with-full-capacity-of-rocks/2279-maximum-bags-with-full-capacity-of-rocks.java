class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < capacity.length; i++) {
            int need = capacity[i] - rocks[i];

            if (need == 0) {
                count++;
            } else {
                list.add(need);
            }
        }

        Collections.sort(list);

        for (int need : list) {
            if (need <= additionalRocks) {
                count++;
                additionalRocks -= need;
            } else {
                break;
            }
        }

        return count;
    }
}