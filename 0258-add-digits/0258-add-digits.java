class Solution {
    public int addDigits(int num) {
      while(num>9){
            int ans=0,rem;
            while(num!=0){
              rem=num%10;
              ans+=rem;
              num/=10;
            }
            num=ans;
        }
        return num;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna