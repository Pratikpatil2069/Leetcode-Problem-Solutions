class Solution {
    public long coloredCells(int n) {
        long TotalCell=1;
       
        for(int i=0;i<n;i++){
            TotalCell=TotalCell+(4*i);
        }
        return TotalCell;
    }
}