/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int getCount(Node root, int l, int h) {
        // code here
        if(root==null) return 0;
        
        if(root.data<l) return getCount(root.right,l,h);;
        if(root.data>h) return getCount(root.left,l,h);
        else return 1+getCount(root.left,l,h)+getCount(root.right,l,h);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna