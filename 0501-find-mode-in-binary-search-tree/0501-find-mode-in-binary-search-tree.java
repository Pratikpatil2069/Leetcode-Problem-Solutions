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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer>map=new HashMap<>();
        fun(root,map);
        int max=Integer.MIN_VALUE;
        Set<Integer>set=map.keySet();
        for(int key:set){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
       for(int key:set){
        if(map.get(key)==max){
            list.add(key);
        }
       }
       int arr[]=new int[list.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
       }
        return arr;
    }
    private void fun(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        fun(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        fun(root.right,map);
    }
}