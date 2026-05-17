class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i=0;i<intervals.length;i++){
            pq.add(intervals[i]);
        }
        int arr[] = pq.poll();
        int min = arr[0];
        int max = arr[1];
        while (!pq.isEmpty()) {
            int arr1[] = pq.poll();
            if (max >= arr1[0]) {
                min = Math.min(arr1[0], min);
                max = Math.max(arr1[1], max);
            } else {
                list.add(new int[] { min, max });
                min = arr1[0];
                max = arr1[1];
            }
        }
        list.add(new int[]{min,max});
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}