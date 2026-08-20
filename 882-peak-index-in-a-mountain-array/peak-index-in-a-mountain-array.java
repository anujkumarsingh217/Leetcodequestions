class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int s=0,e=n-1,ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=arr[mid+1]){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna