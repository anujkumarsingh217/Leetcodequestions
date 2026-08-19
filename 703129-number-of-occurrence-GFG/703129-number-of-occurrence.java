class Solution {
     static int getLowerBound(int []arr,int target){
         int n=arr.length;
         int start=0;
         int end=n-1;
         int ans=n;
         
         while(start<=end){
             int mid =start+(end-start)/2;
             if(arr[mid]>=target){
                 ans=mid;
                 end=mid-1;
             }
             else{
                 start=mid+1;
             }
         }
         return ans;
     }
     static int getUpperBound(int []arr,int target){
         int n=arr.length;
         int start=0;
         int end=n-1;
         int ans=n;
         
         while(start<=end){
             int mid =start+(end-start )/2;
             if(arr[mid]<=target){
                 start=mid+1;
             }
             else{
                 ans=mid;
                 end=mid-1;
             }
         }
         return ans;
     }
    int countFreq(int[] arr, int target) {
        // code here
       int lbindex=getLowerBound(arr,target);
       int ubindex=getUpperBound(arr,target);
        return ubindex-lbindex;
       
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna