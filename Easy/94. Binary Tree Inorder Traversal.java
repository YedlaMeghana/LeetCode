/* 94. Binary Tree Inorder Traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example :
Input: root = [1,null,2,3]
Output: [1,3,2] */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
    }

    private void traverse(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        traverse(root.left, ans);
        ans.add(root.val);
        traverse(root.right, ans);
    }
}
