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
       avg(root,count);
       return count[0];
    }
    public void avg(TreeNode root,int[] count){
        if(root==null){
            return;
        }
        if(root.left!=null){
            avg(root.left,count);
        }
        int AVG[]=countNode(root);
        if(AVG[1]/AVG[0]==root.val){
            count[0]++;
        }
        if(root.right!=null){
            avg(root.right,count);
        }       
    }
    public int[] countNode(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
            int[] leftSum=countNode(root.left);
        
        
            int[] rightSum=countNode(root.right);
        
        int totalCount= leftSum[0]+rightSum[0]+1;
        int totalSum=leftSum[1]+rightSum[1]+root.val;
        return new int[]{totalCount,totalSum};
    }
}