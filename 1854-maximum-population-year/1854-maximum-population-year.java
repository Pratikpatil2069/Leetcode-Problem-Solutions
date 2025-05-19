class Solution {
    public int maximumPopulation(int[][] logs) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < logs.length; i++) {
            int year = logs[i][0];
            int count = 0;

            for (int j = 0; j < logs.length; j++) {
                if (logs[j][0] <= year && logs[j][1] > year) {
                    count++;
                }
            }

            map.put(year, count);
            max = Math.max(max, count);
        }

        Set<Integer> set = map.keySet();
        int min = Integer.MAX_VALUE;

        for (Integer key : set) {
            if (map.get(key) == max) {
                min = Math.min(min, key);
            }
        }

        return min;
    }
}
