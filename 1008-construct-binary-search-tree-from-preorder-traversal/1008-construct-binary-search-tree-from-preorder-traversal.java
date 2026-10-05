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
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode head=new TreeNode(preorder[0]);
        stack.push(head);
        for(int i=1;i<preorder.length;i++){
            TreeNode newNode=new TreeNode(preorder[i]);
            if(stack.peek().val>preorder[i]){
                stack.peek().left=newNode;
                
            }else{
                TreeNode temp=null;
                while(!stack.isEmpty() && stack.peek().val<preorder[i]){
                    temp=stack.pop();
                }
                temp.right=newNode;
            }
            stack.push(newNode);
        }
        return head;
    }
}