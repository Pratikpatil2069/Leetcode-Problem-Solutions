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
    public int minDiffInBST(TreeNode root) {
       List<Integer>list=new ArrayList<>();
       int min=Integer.MAX_VALUE;
       fun(root,list);
       for(int i=0;i<list.size()-1;i++){
        min=Math.min((list.get(i+1)-list.get(i)),min);
       }
       return min;
    }
    public void fun(TreeNode root,List<Integer>list){
        if(root==null){
            return ;
        }
        fun(root.left,list);
        list.add(root.val);
        fun(root.right,list);
    }
}