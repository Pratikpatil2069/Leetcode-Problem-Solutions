class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];

        // Step 1: last occurrence
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;

        // Step 2: greedy partitioning
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                res.add(end - start + 1);
                start = i + 1;
            }
        }

        return res;
    }
}
