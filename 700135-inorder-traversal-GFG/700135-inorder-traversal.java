/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public void dfs(Node root,ArrayList<Integer> ans){
        if (root==null) return ;

              
               dfs(root.left,ans);
                ans.add(root.data);
               dfs(root.right,ans);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        dfs(root,ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna