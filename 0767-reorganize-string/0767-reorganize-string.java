class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char ch : map.keySet()) {
            pq.add(new int[] { ch, map.get(ch) });
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int arr[] = pq.poll();

            sb.append((char) arr[0]);
            arr[1]--;

            int arr1[];

            if (!pq.isEmpty()) {
                arr1 = pq.poll();

                sb.append((char) arr1[0]);
                arr1[1]--;
            } else {
                if (arr[1] > 0)
                    return "";
                break;
            }

            if (arr[1] > 0) {
                pq.add(arr);
            }

            if (arr1[1] > 0) {
                pq.add(arr1);
            }
        }
        return sb.toString();
    }
}