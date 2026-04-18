class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (char key : map.keySet()) {
            pq.add(new int[]{key, map.get(key)});
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            int[] ch = pq.poll();
            char c = (char) ch[0];
            int fre = ch[1];
            int count = 0;

            for (int i = 0; i < fre; i++) {
                if (count < repeatLimit) {
                    sb.append(c);
                    count++;

                    if (count == repeatLimit && i + 1 < fre) {
                        if (pq.size() > 0) {
                            int[] next = pq.poll();
                            sb.append((char) next[0]);

                            if (next[1] > 1) {
                                next[1]--;
                                pq.add(next);
                            }

                            count = 0;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}