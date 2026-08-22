class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        if (groupSize == 1) {
            return true;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            pq.add(new int[] { key, map.get(key) });
        }
        int size = 1;
        int n[] = pq.poll();
        int num = n[0];
        if (n[1] > 1) {
            n[1] = n[1] - 1;
            pq1.add(n);
        }
        while (!pq.isEmpty()) {
            int arr[] = pq.poll();
            if (arr[0] == num + 1) {
                size++;
                num = num + 1;
            } else {
                return false;
            }

            if (arr[1] > 1) {
                arr[1] = arr[1] - 1;
                pq1.add(arr);
            }
            if (size == groupSize) {
                while (!pq1.isEmpty()) {
                    pq.add(pq1.poll());
                }
                if (!pq.isEmpty()) {
                    int n1[] = pq.poll();
                    num = n1[0];
                    size = 1;
                    if (n1[1] > 1) {
                        n1[1] = n1[1] - 1;
                        pq1.add(n1);
                    }
                }

            }
        }
        if (size != groupSize || !pq.isEmpty() || !pq1.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}