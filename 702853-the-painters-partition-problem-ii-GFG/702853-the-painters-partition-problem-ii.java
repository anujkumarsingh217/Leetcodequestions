class Solution {
    static boolean isValidSolutions(int boards[],int k,int maxlength){
        int painterCount=1;
        int painterlength=0;
        for(int i=0;i<boards.length;i++){
            if(painterlength+boards[i]<=maxlength){
                painterlength+=boards[i];
            }
            else{
                painterCount++;
                
                if(painterCount>k||boards[i]>maxlength){
                    return false;
                }
                else{
                    painterlength=boards[i];
                }
            }
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        int ans=-1;
        int s=0,e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidSolutions(arr,k,mid)){
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