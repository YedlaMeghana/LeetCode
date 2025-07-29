/* 145. Binary Tree Postorder Traversal
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,6,7,5,2,9,8,3,1] */


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
    private List<Integer> post(TreeNode root, List<Integer> arr){
        if(root == null) return arr;
        post(root.left , arr);
        post(root.right, arr);
        arr.add(root.val);

        return arr;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        return post(root , arr);
    }
}
