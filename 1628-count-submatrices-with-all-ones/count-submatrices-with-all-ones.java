class Solution {
    public int numSubmat(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int ans=0;
        int[] height= new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    height[j]++;
                }else{
                    height[j]=0;
                }
            }
            for(int j=0;j<n;j++){
                int min=Integer.MAX_VALUE;
                for(int k=j;k>=0;k--){
                    min=Math.min(min,height[k]);
                    if(min==0)
                    break;
                    ans+=min;
                }
            }
        }
        return ans;
    }
}