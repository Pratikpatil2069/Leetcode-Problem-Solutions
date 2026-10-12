
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, -2);

        return find(coins, amount, dp);
    }

    public int find(int[] coins, int amount, int dp[]) {
        if (amount == 0) {
            return 0;
        }

        if (dp[amount] != -2) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                int result = find(coins, amount - coins[i], dp);

                if (result != -1) {
                    min = Math.min(min, result + 1);
                }
            }
        }

        dp[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return dp[amount];
    }
}
