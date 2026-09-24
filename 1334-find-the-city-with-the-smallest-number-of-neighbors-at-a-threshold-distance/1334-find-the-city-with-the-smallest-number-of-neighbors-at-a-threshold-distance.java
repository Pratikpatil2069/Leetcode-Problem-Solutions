class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int matrix[][]=new int[n][n];
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            int dist=edges[i][2];
            matrix[v1][v2]=dist;
            matrix[v2][v1]=dist;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || matrix[i][j]!=0){
                    continue;
                }
                matrix[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][k]!=Integer.MAX_VALUE && matrix[k][j]!=Integer.MAX_VALUE){
                        matrix[i][j]=Math.min(matrix[i][j], matrix[i][k]+matrix[k][j]);
                    }
                    
                }
            }
        }
        int node=0;
        int finalSum=0;
        int finalCount=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            int sum=0;
            for(int j=0;j<n;j++){
                if(i!=j && matrix[i][j]<=distanceThreshold){
                    count++;
                    sum=sum+matrix[i][j];
                }
            }
            if(count<=finalCount){
                finalCount=count;
                finalSum=sum;
                node=i;
            }
        }
        return node;
    }
}