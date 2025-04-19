public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // If the tree is empty, there's no path to check
        if (root == null) {
            return false;
        }

        // If we reach a leaf node, check if the remaining sum equals the node's value
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Recursively check the left and right subtree with the updated target sum
        targetSum -= root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
