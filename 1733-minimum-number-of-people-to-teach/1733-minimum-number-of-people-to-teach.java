class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {

        List<Set<Integer>> lang = new ArrayList<>();

        for (int[] arr : languages) {
            Set<Integer> set = new HashSet<>();
            for (int x : arr) {
                set.add(x);
            }
            lang.add(set);
        }

        Set<Integer> badUsers = new HashSet<>();

        for (int[] f : friendships) {
            int u = f[0] - 1;
            int v = f[1] - 1;

            boolean common = false;

            for (int l : lang.get(u)) {
                if (lang.get(v).contains(l)) {
                    common = true;
                    break;
                }
            }

            if (!common) {
                badUsers.add(u);
                badUsers.add(v);
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int language = 1; language <= n; language++) {

            int teach = 0;

            for (int user : badUsers) {
                if (!lang.get(user).contains(language)) {
                    teach++;
                }
            }

            ans = Math.min(ans, teach);
        }

        return ans;
    }
}