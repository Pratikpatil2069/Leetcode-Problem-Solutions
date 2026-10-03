class Solution {
    public int maxSum(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length-2;i++){
            int sum=0;
            for(int j=1;j<grid[i].length-1;j++){
                sum=grid[i][j]+grid[i][j-1]+grid[i][j+1]+grid[i+1][j]+grid[i+2][j]+grid[i+2][j-1]+grid[i+2][j+1];
            
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}