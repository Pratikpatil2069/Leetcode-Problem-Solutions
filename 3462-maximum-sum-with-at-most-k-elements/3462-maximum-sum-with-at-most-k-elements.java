class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
            int limit=limits[i];
            for(int j=grid[i].length-1;j>=0;j--){
                if(limit<=0){
                    break;
                }
                list.add(grid[i][j]);
                limit--;
            }
            
        }
        long sum=0;
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<k;i++){
            sum+=list.get(i);
        }
        return sum;
    }
}