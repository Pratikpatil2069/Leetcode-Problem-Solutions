class Solution {
    public int[][] sortMatrix(int[][] grid) {
        boolean flag=false;
        for(int i=grid.length-1;i>0;i--){
            int r=0,c=i;
            List<Integer>list=new ArrayList<>();
            while(r<grid.length && c<grid.length){
                list.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(list);
            r=0;
            c=i;
            int ind=0;
            while(r<grid.length && c<grid.length){
                grid[r][c]=list.get(ind++);
                r++;
                c++;
            }

        }
        for(int i=0;i<grid.length;i++){
            int r=i,c=0;
            List<Integer>list=new ArrayList<>();
            while(r<grid.length && c<grid.length){
                list.add(grid[r][c]);
                r++;
                c++;
            }
            r=i;
            c=0;
            int ind=0;
            Collections.sort(list, Collections.reverseOrder());
            while(r<grid.length && c<grid.length){
                grid[r][c]=list.get(ind++);
                r++;
                c++;
            }

        }
        return grid;
    }
}