class Solution {
    static int getFirstOccIndex(int[][] arr,int rowIndex){
        int totalRow=arr.length;
        int totalCol=arr[0].length;
        int target=1;
        int ans=0;

        if(arr[rowIndex][totalCol-1]==0){
            return totalCol;
        }
        else{
            int start=0;
            int end=totalCol-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[rowIndex][mid]==0){
                    start=mid+1;
                }
                else{
                    ans=mid;
                    end=mid-1;
                }
            }
        }
        return ans;


    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int totalRow=mat.length;
        int totalCol=mat[0].length;
        int maxi=-1;
        int maxOneWaliRowIndex=0;

        for(int row=0;row<totalRow;row++){
           
            int oneCount = 0;

            for (int col = 0; col < totalCol; col++) {

                if (mat[row][col] == 1) {
                    oneCount++;
                }
            }

            if (oneCount > maxi) {
                maxi = oneCount;
                maxOneWaliRowIndex = row;
            }
        }
        return new int[] { maxOneWaliRowIndex, maxi };
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna