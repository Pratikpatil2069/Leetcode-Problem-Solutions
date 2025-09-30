class Solution {
    public void setZeroes(int[][] matrix) {
       Set<Integer>set1=new HashSet<>();
       Set<Integer>set2=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(set1.contains(i)){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            } 
        }
         for(int i=0;i<matrix[0].length;i++){
            if(set2.contains(i)){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            } 
         }
    }
}