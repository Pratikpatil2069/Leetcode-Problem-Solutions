class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {

        List<List<Integer>> list = new ArrayList<>();

        int p2 = 0;

    
        for (int i = 0; i < series1.length; i++) {

            int timestamp = series1[i][0];
            int value = series1[i][1];

            while (p2 < series2.length && series2[p2][0] < timestamp) {
                p2++;
            }

            if (p2 < series2.length) {
                value += series2[p2][1];
            }

            list.add(Arrays.asList(timestamp, value));
        }

        int p1 = 0;


        for (int i = 0; i < series2.length; i++) {

            int timestamp = series2[i][0];
            int value = series2[i][1];
            boolean flag = true;

            while (p1 < series1.length && series1[p1][0] < timestamp) {
                p1++;
            }

            if (p1 < series1.length) {

                if (series1[p1][0] == timestamp) {
                    flag = false;
                } else {
                    value += series1[p1][1];
                }
            }

            if (flag) {
                list.add(Arrays.asList(timestamp, value));
            }
        }

        list.sort(Comparator.comparingInt(a -> a.get(0)));

        return list;
    }
}