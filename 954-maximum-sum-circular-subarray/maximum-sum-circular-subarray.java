class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int currentmax=0;
        int max=Integer.MIN_VALUE;
        int currentmin=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            currentmax = Math.max(nums[i],currentmax + nums[i]);
            max = Math.max(max,currentmax);
            currentmin = Math.min(nums[i], currentmin + nums[i]);
            min = Math.min(min, currentmin);
            total += nums[i];
        }
        if(max<0){
            return max;
        }
        return Math.max(max,total-min);
    }
}