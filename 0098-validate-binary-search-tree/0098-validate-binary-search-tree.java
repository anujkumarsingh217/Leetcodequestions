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
    public boolean isValidBST(TreeNode root) {
        return cksBST(root,null,null);
    }
    public  boolean cksBST(TreeNode node,Integer low,Integer high){
        if(node == null){
            return true;
        }
        if((low!=null && node.val<=low) ||(high!=null && node.val>=high)){
            return false;
        }
        return cksBST(node.left,low,node.val)&& cksBST(node.right,node.val,high);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna