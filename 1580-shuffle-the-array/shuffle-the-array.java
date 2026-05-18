class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
            arr.add(nums[i+n]);
        }
        int [] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}