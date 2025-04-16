class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(int[] a, int[] b) {
                return b[1] - a[1];
            }
        });
        for (int i = 0; i < score.length; i++) {
            pq.add(new int[] { i, score[i] });
        }
        String nums[] = new String[score.length];
        if (score.length >= 3) {
            int num1[] = pq.poll();
            nums[num1[0]] = "Gold Medal";
            int num2[] = pq.poll();
            nums[num2[0]] = "Silver Medal";
            int num3[] = pq.poll();
            nums[num3[0]] = "Bronze Medal";
            for (int i = 4; i <= score.length; i++) {
                int num[] = pq.poll();
                nums[num[0]] = String.valueOf(i);
            }
        } else if (score.length == 1) {
            int num1[] = pq.poll();
            nums[num1[0]] = "Gold Medal";
        } else if (score.length == 2) {
            int num1[] = pq.poll();
            nums[num1[0]] = "Gold Medal";
            int num2[] = pq.poll();
            nums[num2[0]] = "Silver Medal";
            int num3[] = pq.poll();
        } else if (score.length == 3) {
            int num1[] = pq.poll();
            nums[num1[0]] = "Gold Medal";
            int num2[] = pq.poll();
            nums[num2[0]] = "Silver Medal";
            int num3[] = pq.poll();
            nums[num3[0]] = "Bronze Medal";
        }
        return nums;
    }
}