class Solution {
    public int deleteGreatestValue(int[][] grid) {
       for(int i=0;i<grid.length;i++){
        int arr[]=new int[grid[0].length];
         for(int j=0;j<grid[0].length;j++){
           arr[j]=grid[i][j];
        }
        Arrays.sort(arr);
        for(int j=0;j<grid[0].length;j++){
           grid[i][j]=arr[arr.length-1-j];
        }
       }
        int sum=0;
        for(int i=0;i<grid[0].length;i++){
            int max=0;
        for(int j=0;j<grid.length;j++){
           max=Math.max(max,grid[j][i]);
        }
        sum+=max;
       }
        return sum;
    }
}