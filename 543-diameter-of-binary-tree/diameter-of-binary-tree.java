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
    static int maxi;
    public int diameterOfBinaryTree(TreeNode root) {
        maxi=0;
        levels(root);
        return maxi;
    }
    public int levels(TreeNode root){
        if(root==null) return 0;

        int leftlevels=levels(root.left);
        int rightlevels=levels(root.right);
        maxi=Math.max(maxi,leftlevels+rightlevels);
         return 1+Math.max(leftlevels,rightlevels);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna