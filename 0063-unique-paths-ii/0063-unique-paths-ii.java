class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(obstacleGrid, 0, 0, dp);
    }

    private int fun(int[][] obstacleGrid, int i, int j, int[][] dp) {

        
        if (i >= obstacleGrid.length || j >= obstacleGrid[0].length || obstacleGrid[i][j] == 1) {
            return 0;
        }

        if (i == obstacleGrid.length - 1 && j == obstacleGrid[0].length - 1) {
            return 1;
        }

      
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = fun(obstacleGrid, i + 1, j, dp);
        int right = fun(obstacleGrid, i, j + 1, dp);

        dp[i][j] = down + right;

        return dp[i][j];
    }
}