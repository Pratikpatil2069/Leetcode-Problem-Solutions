class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int arr[][]=new int[m][n];
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    arr[i][j]=2;
                    queue.add(new int[]{i,j,0});
                }
            }
        }

        int max=0;

        while(!queue.isEmpty()){
            int ind[]=queue.poll();
            boolean flag=false;
            if(ind[0]-1>=0 && grid[ind[0]-1][ind[1]]==1){
                grid[ind[0]-1][ind[1]]=2;
                arr[ind[0]-1][ind[1]]=2;
                queue.add(new int[]{ind[0]-1,ind[1],ind[2]+1});
                max=Math.max(ind[2]+1,max);
               
            }
            if(ind[0]+1<m && grid[ind[0]+1][ind[1]]==1){
                grid[ind[0]+1][ind[1]]=2;
                arr[ind[0]+1][ind[1]]=2;
                queue.add(new int[]{ind[0]+1,ind[1],ind[2]+1});
                max=Math.max(ind[2]+1,max);
                
            }
            if(ind[1]-1>=0 && grid[ind[0]][ind[1]-1]==1){
                grid[ind[0]][ind[1]-1]=2;
                arr[ind[0]][ind[1]-1]=2;
                max=Math.max(ind[2]+1,max);
                queue.add(new int[]{ind[0],ind[1]-1,ind[2]+1});
            }
            if(ind[1]+1<n && grid[ind[0]][ind[1]+1]==1){
                grid[ind[0]][ind[1]+1]=2;
                arr[ind[0]][ind[1]+1]=2;
                max=Math.max(ind[2]+1,max);
                queue.add(new int[]{ind[0],ind[1]+1,ind[2]+1});
            }

        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return max;

    }
}