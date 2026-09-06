class Solution {
    public int countRotations(String s, int k) {

        int n = s.length();
        int ans = 0;

        for (int start = 0; start < n; start++) {

            int count = 0;

          
            for (int j = 0; j < n - 1; j++) {

                char first = s.charAt((start + j) % n);
                char second = s.charAt((start + j + 1) % n);

                if (first == second) {
                    count++;
                }
            }

            if (count == k) {
                ans++;
            }
        }

        return ans;
    }
}