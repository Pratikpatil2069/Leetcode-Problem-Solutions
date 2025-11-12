/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];

        // Initialize all values to -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(mat[i], -1);
        }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (head != null && top <= bottom && left <= right) {
            // Traverse from left to right
            for (int j = left; j <= right && head != null; j++) {
                mat[top][j] = head.val;
                head = head.next;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom && head != null; i++) {
                mat[i][right] = head.val;
                head = head.next;
            }
            right--;

            // Traverse from right to left
            for (int j = right; j >= left && head != null; j--) {
                mat[bottom][j] = head.val;
                head = head.next;
            }
            bottom--;

            // Traverse from bottom to top
            for (int i = bottom; i >= top && head != null; i--) {
                mat[i][left] = head.val;
                head = head.next;
            }
            left++;
        }

        return mat;
    }
}
