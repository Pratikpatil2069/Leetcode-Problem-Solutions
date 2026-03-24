class Solution {
    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            int count = 0;
            boolean flag = true;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) {
                    count++;
                    if (count > grid.length / 2) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                for (int j = 0; j < grid.length; j++) {
                    grid[j][i] ^= 1;
                }
            }

        }
        int sum=0;
        for(int i=0;i<grid.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid[i].length;j++){
                sb.append(grid[i][j]);
            }
            sum+=Integer.parseInt(sb.toString(),2);
        }
        return sum;
    }
}