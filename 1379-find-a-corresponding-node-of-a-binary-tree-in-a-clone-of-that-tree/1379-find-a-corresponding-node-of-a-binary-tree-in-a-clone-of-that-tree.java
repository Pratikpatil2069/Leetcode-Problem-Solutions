/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return find(cloned,target);
    }
    public TreeNode find(TreeNode cloned,TreeNode target){
        if(cloned==null){
            return null;
        }
       
         TreeNode t1=find(cloned.left,target);
         if(t1!=null){
            return t1;
         }
         if(cloned.val==target.val){
            return cloned;
        }
         return find(cloned.right,target);
        
    }
}