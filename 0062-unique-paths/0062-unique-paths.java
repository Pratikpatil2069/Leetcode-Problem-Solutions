class Solution {
    int arr[][]=new int[101][101];
    public int uniquePaths(int m, int n) {
        for(int[] a:arr){
            Arrays.fill(a,-1);
        }
        
        return path(m,n,1,1);
    }
    public int path(int m,int n, int i, int j){
        if(i>m || i<1 || j>n || j<1 ){
            return 0;
        }
        if(m==i && n==j){
            return 1;
        }
        if(arr[i][j]!=-1){
            return arr[i][j];
        }

        return arr[i][j]=path(m,n,i,j+1) + path(m,n,i+1,j);
    }
}