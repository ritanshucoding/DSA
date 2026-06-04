class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] nums = new int [n];
        int strt=0;
        int end=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0) {
            nums[strt]=arr[i];
            strt+=2;
            }else{
                nums[end]=arr[i];
            end+=2;
            }
        }
        return nums;
    }
}