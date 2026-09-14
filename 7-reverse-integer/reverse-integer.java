class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
           int ld=x%10;
            rev=rev*10+ld;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            x/=10;       
        }
        return (int)rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna