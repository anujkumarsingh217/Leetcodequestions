class Solution {
    // Returns level of given data value
    int getLevel(Node node, int data) {
        return getLevelUtil(node, data, 1);
    }

    private int getLevelUtil(Node node, int data, int level) {
        // Base case: if node is null, the target is not in this branch
        if (node == null) {
            return 0;
        }

        // If we found the target data, return its current level
        if (node.data == data) {
            return level;
        }

        // Search in the left subtree
        int downlevel = getLevelUtil(node.left, data, level + 1);
        if (downlevel != 0) {
            return downlevel;
        }

        // If not found in left, search in the right subtree
        return getLevelUtil(node.right, data, level + 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna