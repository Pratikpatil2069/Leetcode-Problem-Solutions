class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];

        // Step 1: fill all with 'a'
        for (int i = 0; i < n; i++) {
            res[i] = 'a';
        }

        int extra = k - n;

        // Step 2: distribute from the end
        for (int i = n - 1; i >= 0 && extra > 0; i--) {
            int add = Math.min(25, extra);
            res[i] = (char) (res[i] + add);
            extra -= add;
        }

        return new String(res);
    }
}
