class Solution {
    public long countCommas(long n) {
        long curr=1000;
        long res=0;
        while(curr<=n){
            res+=n-curr+1;
            curr*=1000;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna