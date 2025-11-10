class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int i=mat[0].length-1;i>0;i--){
            int m=0,n=i;
            ArrayList<Integer>list=new ArrayList<>();
            while(m<mat.length && n<mat[0].length){
                list.add(mat[m][n]);
                m++;
                n++;
            }
            Collections.sort(list);
            m=0;
            n=i;
            while(m<mat.length && n<mat[0].length){
               mat[m][n]=list.get(m);
                m++;
                n++;
            }
        }

        for(int i=0;i<mat.length;i++){
            int m=i,n=0;
            ArrayList<Integer>list=new ArrayList<>();
            while(m<mat.length && n<mat[0].length){
                list.add(mat[m][n]);
                m++;
                n++;
            }
            Collections.sort(list);
            m=i;
            n=0;
            while(m<mat.length && n<mat[0].length){
               mat[m][n]=list.get(n);
                m++;
                n++;
            }
        }
        return mat;
    }
}