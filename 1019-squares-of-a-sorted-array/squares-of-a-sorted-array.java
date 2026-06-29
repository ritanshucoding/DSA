class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int i=0;
        int j= n-1;
        int[] arr = new int[n];
        int k= n-1;
        while(i<=j){
            int left = nums[i]*nums[i];
        int right = nums[j]*nums[j];
            if(left>right){
                arr[k]=left;
                i++;
            }else{
                arr[k]=right;
                j--;
            }
            k--;
        }
        return arr;
    }
}