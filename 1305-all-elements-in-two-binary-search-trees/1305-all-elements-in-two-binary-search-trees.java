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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>list1=new ArrayList<>();
        inorderSearch(root1,list1);
        List<Integer>list2=new ArrayList<>();
        inorderSearch(root2, list2);
        int ind=0;
        boolean flag=true;
        for(int i=0;i<list1.size();i++){
            if(ind==list2.size()){
                flag=false;
                break;
            }
            if(list1.get(i)>list2.get(ind)){
                list1.add(i,list2.get(ind++));
            }
        }
        if(flag){
            for(int i=ind;i<list2.size();i++){
                list1.add(list2.get(i));
            }
        }
        return list1;
    }
    public void inorderSearch(TreeNode root, List<Integer>list){
        if(root==null){
            return;
        }
        inorderSearch(root.left,list);
        list.add(root.val);
        inorderSearch(root.right,list);
    }
}