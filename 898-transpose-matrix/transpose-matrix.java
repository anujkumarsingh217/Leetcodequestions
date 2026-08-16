class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return new int[0][0];
        }

        int trow=matrix.length;
        int tcol=matrix[0].length;

        int newrow=tcol;
        int newcol=trow;

        int [][] ans=new int[newrow][newcol];

        for(int i=0;i<trow;i++){
            for(int j=0;j<tcol;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}