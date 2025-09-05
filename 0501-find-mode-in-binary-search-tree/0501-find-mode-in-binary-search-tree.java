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
    int maxCount=0;
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        fun(root,map,list);
       int arr[]=new int[list.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
       }
        return arr;
    }
    private void fun(TreeNode root,HashMap<Integer,Integer> map,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        fun(root.left,map,list);
        int count=map.getOrDefault(root.val,0)+1;
        map.put(root.val,count);
        if(count>maxCount){
            maxCount=count;
            list.clear();
            list.add(root.val);
        }else if(count==maxCount){
            list.add(root.val);
        }
        fun(root.right,map,list);
    }
}