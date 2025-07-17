/* 114. Flatten Binary Tree to Linked List
Given the root of a binary tree, flatten the tree into a "linked list":
The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
Example:
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6] */

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
    public void preOrder(TreeNode root, List<TreeNode> arr){
        if(root == null)    return;
        arr.add(root);
        preOrder(root.left,arr);
        preOrder(root.right,arr);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();
        preOrder(root,arr);
        for(int i=1;i<arr.size();i++){
            TreeNode prev = arr.get(i-1);
            TreeNode curr = arr.get(i);
            prev.left = null;
            prev.right = curr;
            prev = curr;
        }
    }
}
