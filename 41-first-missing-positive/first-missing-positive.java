class Solution {
    public void swap(int i, int j, int[] nums) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i = 0;
        while (i<n){
            int corr =nums[i]-1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[corr]) {
                swap(i, corr, nums);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}