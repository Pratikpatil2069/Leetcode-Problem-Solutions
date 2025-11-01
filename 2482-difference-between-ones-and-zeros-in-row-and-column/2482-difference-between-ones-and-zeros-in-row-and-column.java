class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        HashMap<Integer,Integer>row=new HashMap<>();
        HashMap<Integer,Integer>col=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    row.put(i,row.getOrDefault(i,0)+1);
                    col.put(j,col.getOrDefault(j,0)+1);
                }
            }
        }
        for(int i=0;i<r;i++){
            int onesRowi=0;
            int zerosRowi=c;
            if(row.containsKey(i)){
                  onesRowi=row.get(i);
                 zerosRowi=c-onesRowi;
            }
            for(int j=0;j<c;j++){
                int onesColj=0;
                int  zerosColj=r;
                if(col.containsKey(j)){
                      onesColj=col.get(j);
                      zerosColj=r-onesColj;
                }
               grid[i][j]=onesRowi+onesColj-zerosRowi-zerosColj;
            }
        }
        return grid;
    }
}