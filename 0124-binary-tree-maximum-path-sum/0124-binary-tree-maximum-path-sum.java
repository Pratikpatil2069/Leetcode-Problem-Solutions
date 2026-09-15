/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int maxSum[]=new int[1];
        maxSum[0]=Integer.MIN_VALUE;
        pathSum(root,maxSum);
        return maxSum[0];
    }
    public int pathSum(TreeNode root,int[] maxSum){
        if(root==null){
            return 0;
        }
        int leftSum=pathSum(root.left,maxSum);
        int rightSum=pathSum(root.right,maxSum);
        if(leftSum<0){
            leftSum=0;
        }
        if(rightSum<0){
            rightSum=0;
        }
        maxSum[0]=Math.max(maxSum[0],leftSum+rightSum+root.val);
        return Math.max(leftSum,rightSum)+root.val;
    }
}