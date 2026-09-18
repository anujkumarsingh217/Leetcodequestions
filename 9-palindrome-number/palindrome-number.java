class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long rev = 0;
        long n = x;

        while (x != 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x /= 10;
        }

        return n == rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna