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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode temp = root;
        queue.add(temp);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode ptr = queue.poll();
                if(flag){
                    list1.add(ptr.val);
                }else{
                    list1.addFirst(ptr.val);
                }
                
                if (ptr.left != null) {
                    queue.add( ptr.left);
                }
                if (ptr.right != null) {
                    queue.add( ptr.right);
                }
            }
            list.add(list1);
            flag = (flag) ? false : true;
        }
        return list;

    }
}