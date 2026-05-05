class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0] + b[1]) - (a[0] + a[1]));
        
        for (int i = 0; i < aliceValues.length; i++) {
            pq.add(new int[]{aliceValues[i], bobValues[i]});
        }
        
        int aliceScore = 0;
        int bobScore = 0;
        boolean flag = true;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            if (flag) {
                aliceScore += curr[0];
                flag = false;
            } else {
                bobScore += curr[1];
                flag = true;
            }
        }
        
        if (aliceScore > bobScore) {
            return 1;
        } else if (aliceScore < bobScore) {
            return -1;
        } else {
            return 0;
        }
    }
}