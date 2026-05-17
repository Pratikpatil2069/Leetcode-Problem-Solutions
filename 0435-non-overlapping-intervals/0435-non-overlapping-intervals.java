class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i=0;i<intervals.length;i++){
            pq.add(intervals[i]);
        }
        int arr[] = pq.poll();
        int max = arr[1];
        int count=0;
        while (!pq.isEmpty()) {
            int arr1[] = pq.poll();
            if (max > arr1[0]) {
                max = Math.min(arr1[1], max);
                count++;
            } else {
                max = arr1[1];
            }
        }
        
        return count;
        
    }
}