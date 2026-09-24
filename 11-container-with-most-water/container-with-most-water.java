class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,ans=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            ans=Math.max(ans,h*w);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna