class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        
        return path(m,n,1,1,dp);
    }
    public int path(int m,int n, int i, int j,int[][] dp){
        if(i>m || i<1 || j>n || j<1 ){
            return 0;
        }
        if(m==i && n==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        return dp[i][j]=path(m,n,i,j+1,dp) + path(m,n,i+1,j,dp);
    }
}