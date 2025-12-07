class Solution {
    public int minimumArea(int[][] grid) {
        int top=-1;
        int bottom=-1;
        int left=-1;
        int right=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(top==-1){
                        top=i+1;
                    }
                    bottom=i+1;
                    if(right==-1 && left==-1){
                        right=j+1;
                        left=j+1;
                    }
                   
                    if(right<j+1){
                       right=j+1;
                    }
                    if(left>j+1){
                        left=j+1;
                    }
                    
                }
            }
        }
        return (bottom-top+1)*(right-left+1);
    }
}