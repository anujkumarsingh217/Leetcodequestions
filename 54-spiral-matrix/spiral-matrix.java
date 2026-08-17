class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer>ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        int sr=0;
        int er=m-1;
        int sc=0;
        int ec=n-1;

        while(sr<=er && sc<=ec){
            for(int col=sc;col<=ec;col++){
                ans.add(matrix[sr][col]);
            }
            sr++;
            for(int row=sr;row<=er;row++){
                ans.add(matrix[row][ec]);
            }
            ec--;

            if(sr<=er){
                for(int col=ec;col>=sc;col--){
                    ans.add(matrix[er][col]);
                }
                er--;
            }

            if(sc<=ec){
                for(int row=er;row>=sr;row--){
                    ans.add(matrix[row][sc]);
                }
                sc++;
            }

        }
        return ans;

    }
}