class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n<1){
            return 0;
        }
        while(n!=1){
            if(n%2==1){
                return 0;
            }
            n/=2;
        }
        return 1;


    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna