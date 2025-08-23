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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        TreeNode temp=root1;
        mergeTrees1(root1,root2);
        return temp;
    }
    public void mergeTrees1(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null){
            return;
        }
         if(root1.left!=null && root2.left!=null){
            mergeTrees( root1.left,  root2.left);
        }else if(root2.left!=null && root1.left==null){
            root1.left=root2.left;
        }
        root1.val=root1.val+root2.val;
        if(root1.right!=null && root2.right!=null){
             mergeTrees( root1.right,  root2.right);
        }else if(root2.right!=null && root1.right==null){
             root1.right=root2.right;
        }
    }
}