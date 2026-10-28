class Solution{
    public int[] findPeakGrid(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int l=0,r=m-1;
        while(l<r){
            int mid=l+(r-l)/2;
            int col=0;
            for(int j=1;j<n;j++){
                if(mat[mid][j]>mat[mid][col]){
                    col=j;
                }
            }
            if(mat[mid][col]>mat[mid+1][col]){
                r=mid;
            }else{
                l=mid+1;
            }
        }

        int col=0;
        for(int j=1;j<n;j++){
            if(mat[l][j]>mat[l][col]){
                col=j;
            }
        }

        return new int[]{l,col};
    }
}
