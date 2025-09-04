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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        fun(root,list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            min=Math.min((list.get(i+1)-list.get(i)),min);
        }
        return min;
    }
    private void fun(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        fun(root.left,list);
        list.add(root.val);
        fun(root.right,list);
    }
}