class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> map= new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        for(int i=1; ;i++){
            int mul=k*i;
            if(!map.contains(mul)){
                return mul;
            }
        }
    }
}