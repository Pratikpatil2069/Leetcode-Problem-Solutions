class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0;
        for (int i = 0; i < mat.length; i++) {
            sum1 = sum1 + mat[i][i];
        }
        int ind = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            sum1 = sum1 + mat[i][ind];
            ind--;
        }
        if (mat.length % 2 == 0) {
            return sum1;
        } else {
            return sum1 - mat[mat.length / 2][mat.length / 2];
        }
    }
}