class Solution {
    public int searchInsert(int[] nums, int target) {
         int n=nums.length;
        int start=0,end=n-1,index=n,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                index= mid;
                break;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                index=mid;
                end=mid-1;
            }
        }
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna