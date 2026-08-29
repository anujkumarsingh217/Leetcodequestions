class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,sum=0;
        for(int x:nums){
            sum+=x;
        }
        int ans=n*(n+1)/2;
        return ans-sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna