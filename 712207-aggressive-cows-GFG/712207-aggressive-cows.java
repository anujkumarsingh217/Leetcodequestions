class Solution {
    static boolean isValid(int[] arr,int k,int minDistance){
        int cow=1;
        int lastPosition=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[lastPosition]>=minDistance){
                cow++;
                lastPosition=i;
                if(cow==k){
                    return true;
                }
            }
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int ans=-1;
        int s=0,e=arr[n-1]-arr[0];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(arr,k,mid)){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna