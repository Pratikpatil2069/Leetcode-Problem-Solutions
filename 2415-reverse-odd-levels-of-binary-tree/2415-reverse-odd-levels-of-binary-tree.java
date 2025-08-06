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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        ArrayList<TreeNode>list=new ArrayList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }   
        }
        boolean flag=false;
      for(int i=0;i<list.size();i++){
        int num=(int)Math.pow(2,level);
        int left=i;
        int right = i + num - 1;
        i=right;
        if(flag){
           while(left<right){
                int temp=list.get(left).val;
                list.get(left).val=list.get(right).val;
                list.get(right).val=temp;
                left++;
                right--;
           }
            flag=false;
        }else{
            flag=true;
        }
        level++;
      }
      return root;
    }
}