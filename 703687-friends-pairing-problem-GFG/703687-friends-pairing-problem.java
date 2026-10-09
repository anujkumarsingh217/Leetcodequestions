class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if(n<=2){
            return n;
        }
        int fnm1=countFriendsPairings(n-1);
        int fnm2=countFriendsPairings(n-2);
        int pair=(n-1)*fnm2;
        int tway=fnm1+pair;
        return tway;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna