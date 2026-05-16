class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][] { { newInterval[0], newInterval[1] } };
        }
        boolean flag = true;
        int start = -1;
        int end = -1;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int arr[] = intervals[i];
            if (arr[0] <= newInterval[1] && arr[1] >= newInterval[0]) {
                flag = false;
                if (start == -1) {
                    start = Math.min(arr[0], newInterval[0]);
                } else {
                    start = Math.min(arr[0], Math.min(newInterval[0], start));
                }
                if (end == -1) {
                    end = Math.max(arr[1], newInterval[1]);
                } else {
                    end = Math.max(arr[1], Math.max(newInterval[1], end));
                }
            } else {
                if (start != -1 && end != -1) {
                    list.add(new int[] { start, end });
                    start = -1;
                    end = -1;
                }
                list.add(arr);
            }
        }
        if (flag) {
             

            list.add(newInterval);

            
            Collections.sort(list, (a, b) -> a[0] - b[0]);
        

        }
        if (start != -1 && end != -1) {
            list.add(new int[] { start, end });
        }
        int ans[][] = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}