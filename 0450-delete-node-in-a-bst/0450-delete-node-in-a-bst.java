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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode temp = root.left;
            TreeNode ptr = root.right;

            // Find the smallest node in right subtree
            TreeNode curr = ptr;
            while (curr.left != null) {
                curr = curr.left;
            }

            curr.left = temp;

            return ptr;
        }

        delete(root, key);
        return root;
    }

    public void delete(TreeNode root, int key) {
        if (root == null) {
            return;
        }

        if (root.left != null && root.left.val == key) {
            TreeNode temp = root.left;

            if (temp.left == null && temp.right == null) {
                root.left = null;
            } 
            else if (temp.left == null) {
                root.left = temp.right;
            } 
            else if (temp.right == null) {
                root.left = temp.left;
            } 
            else {
                TreeNode ptr = temp.right;

                while (ptr.left != null) {
                    ptr = ptr.left;
                }

                ptr.left = temp.left;
                root.left = temp.right;
            }

            return;
        }

        if (root.right != null && root.right.val == key) {
            TreeNode temp = root.right;

            if (temp.left == null && temp.right == null) {
                root.right = null;
            } 
            else if (temp.left == null) {
                root.right = temp.right;
            } 
            else if (temp.right == null) {
                root.right = temp.left;
            } 
            else {
                TreeNode ptr = temp.right;

                while (ptr.left != null) {
                    ptr = ptr.left;
                }

                ptr.left = temp.left;
                root.right = temp.right;
            }

            return;
        }

        if (key < root.val) {
            delete(root.left, key);
        } else {
            delete(root.right, key);
        }
    }
}