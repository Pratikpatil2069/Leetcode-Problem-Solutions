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
    public int findSecondMinimumValue(TreeNode root) {
        int minFirst=root.val;
        int minSecond[]={Integer.MAX_VALUE,0};
        fun(root,minFirst,minSecond);
        if(minSecond[1]==0){
            return -1;
        }
        return minSecond[0];
    }
    public void fun(TreeNode root,int minFirst,int []minSecond){
        if(root==null){
            return;
        }
        fun( root.left,minFirst,minSecond);
        if(root.val<=minSecond[0] && root.val!=minFirst){
            minSecond[0]=root.val;
            minSecond[1]=1;
        }
        fun(root.right,minFirst,minSecond);
    }
}