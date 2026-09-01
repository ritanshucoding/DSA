class Solution {
    public int jump(int[] nums) {
        int i=0;
        int j=0;
        int k=0;
        for(int num=0;num<nums.length-1;num++){
            k=Math.max(k,num+nums[num]);
            if(num==j){
                i++;
                j=k;
            }
        }
        return i;
    }
}