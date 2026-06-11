class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=m-1;
        int i1=0;
        int j1=n-1;
        while(i<=j && i1<=j1){
            for( int i2=i1;i2<=j1;i2++){
                arr.add(matrix[i][i2]);
            }
                i++;
                for( int i3=i;i3<=j;i3++){
                arr.add(matrix[i3][j1]);
                }
                j1--;
            if (i <= j) {
            for( int i4=j1;i4>=i1;i4--){
                arr.add(matrix[j][i4]);
            }
                j--;
            }
            if (i1 <= j1){
             for( int i5=j;i5>=i;i5--){
                arr.add(matrix[i5][i1]);
             }
                i1++;
            }
        }
        return arr;
    }
}