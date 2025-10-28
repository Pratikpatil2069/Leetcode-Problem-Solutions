class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int originalSum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                originalSum+=grid[i][j];
            }
        }

        List<Integer>row=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
               max=Math.max(max,grid[i][j]);
            }
            row.add(max);
        }

        List<Integer>col=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
                max=Math.max(max,grid[j][i]);
            }
            col.add(max);
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int val=Math.min(row.get(i),col.get(j));
                grid[i][j]=val;
            }
        }

        int finalSum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                finalSum+=grid[i][j];
            }
        }
        return finalSum-originalSum;        
    }
}