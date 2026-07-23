class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1); // Empty prefix
        int sum=0;
        int count=0;
        for (int num:nums){
            sum +=num;
            int rem=sum%k;
            // Handle negative remainder
            if(rem<0){
                rem+=k;
            }
            count += map.getOrDefault(rem,0);
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}