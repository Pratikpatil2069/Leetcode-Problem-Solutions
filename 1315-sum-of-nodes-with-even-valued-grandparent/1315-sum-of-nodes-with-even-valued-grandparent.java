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
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int sum=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode grandParent=queue.poll();
                if(grandParent.val%2==0){
                    if(grandParent.left!=null){
                        TreeNode parent1=grandParent.left;
                        if(parent1.left!=null){
                            TreeNode child1=parent1.left;
                            sum=sum+child1.val;
                        }
                         if(parent1.right!=null){
                            TreeNode child2=parent1.right;
                            sum=sum+child2.val;
                        }
                    }
                    if(grandParent.right!=null){
                        TreeNode parent2=grandParent.right;
                        if(parent2.left!=null){
                            TreeNode child3=parent2.left;
                            sum=sum+child3.val;
                        }
                         if(parent2.right!=null){
                            TreeNode child4=parent2.right;
                            sum=sum+child4.val;
                        }
   
                    }            
                }
                 if(grandParent.left!=null){
                        queue.add(grandParent.left);
                    }
                    if(grandParent.right!=null){
                        queue.add(grandParent.right);
                    }
                
            }
        }
        return sum;
    }
}