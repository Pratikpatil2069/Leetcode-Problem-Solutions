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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer>set=new HashSet<>();
        int root=0;
        for(int i=0;i<descriptions.length;i++){
            int parent=descriptions[i][0];
            int child=descriptions[i][1];
            set.add(child);
            
            if(!map.containsKey(parent)){
                TreeNode newNode=new TreeNode(parent);
                map.put(parent, newNode);
            }
            if(!map.containsKey(child)){
                TreeNode newNode=new TreeNode(child);
                map.put(child, newNode);
            }
        }
        for(int i=0;i<descriptions.length;i++){
            int parent=descriptions[i][0];
            int child=descriptions[i][1];
            int left=descriptions[i][2];
            if(!set.contains(parent)){
                root=parent;
            }
            TreeNode par=map.get(parent);
            TreeNode chil=map.get(child);
            if(left==1){
                par.left=chil;
            }else{
                par.right=chil;
            }
            
        }
        return map.get(root);
    }
}