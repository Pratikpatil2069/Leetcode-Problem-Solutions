class Solution {
    public int fillCups(int[] amount) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        if (amount[0] != 0) {
            pq.add(amount[0]);
        }

        if (amount[1] != 0) {
            pq.add(amount[1]);
        }
        if (amount[2] != 0) {
            pq.add(amount[2]);
        }
        if (pq.size() == 0) {
            return 0;
        }

        while (pq.size() > 1) {
            int num1 = pq.poll();
            num1--;
            int num2 = pq.poll();
            num2--;
            pq.add(num1);
            if (num2 > 0) {
                pq.add(num2);
            }
            count++;
        }
        return count + pq.poll();
    }
}