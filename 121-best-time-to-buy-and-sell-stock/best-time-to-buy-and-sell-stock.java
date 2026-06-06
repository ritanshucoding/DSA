class Solution {
    public int maxProfit(int[] nums) {
       int i=0;
       int j=1;
       int max=0;
       int n= nums.length;
       while(j<n) {
        if(nums[i]<nums[j]){
        max=Math.max(max,nums[j]-nums[i]);
        }else{
            i=j;
        }
        j++;
       }
       return max;
    }
}