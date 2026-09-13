class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        for (int i = 0; i < n; i++) {
            int k = rowShift[i];

            reverse(grid[i], 0, k - 1);
            reverse(grid[i], k, n - 1);
            reverse(grid[i], 0, n - 1);
        }

        for (int i = 0; i < n; i++) {
            int k = colShift[i];
            int[] arr = new int[n];
            int ind = 0;

            for (int l = 0; l < n; l++) {
                arr[ind++] = grid[l][i];
            }

            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);

            for (int l = 0; l < n; l++) {
                grid[l][i] = arr[l];
            }
        }

        return grid;
    }

    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}