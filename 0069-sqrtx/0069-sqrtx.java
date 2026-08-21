class Solution {
    public int mySqrt(int x) {
        int s=0,e=x,ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            long square=(long)mid*mid;
            if(square==x){
                return mid;
            }
            else if (square>x){
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna