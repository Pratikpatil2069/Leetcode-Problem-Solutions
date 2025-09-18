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
    public int averageOfSubtree(TreeNode root) {
    int count[]=new int [1];
       countNode(root,count);
       return count[0];
    }

    public int[] countNode(TreeNode root,int[] count){
        if(root==null){
            return new int[]{0,0};
        }
        int[] leftSum=countNode(root.left,count);
        int[] rightSum=countNode(root.right,count);
        int totalCount= leftSum[0]+rightSum[0]+1;
        int totalSum=leftSum[1]+rightSum[1]+root.val;
        if(totalSum/totalCount==root.val){
            count[0]++;
        }
        return new int[]{totalCount,totalSum};
    }
}