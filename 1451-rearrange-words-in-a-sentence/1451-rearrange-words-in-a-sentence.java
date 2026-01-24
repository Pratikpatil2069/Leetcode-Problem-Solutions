class Solution {
    public String arrangeWords(String text) {

        String arr[] = text.split(" ");

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>() {
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[2] - b[2];   // ✅ preserve original order
                }
                return a[1] - b[1];       // sort by length
            }
        });

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = Character.toLowerCase(arr[i].charAt(0)) + arr[i].substring(1);
            }
            pq.add(new int[]{i, arr[i].length(), i});
        }

        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int[] data = pq.poll();
            String word = arr[data[0]];

            if (flag) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                flag = false;
            }
            sb.append(word).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
