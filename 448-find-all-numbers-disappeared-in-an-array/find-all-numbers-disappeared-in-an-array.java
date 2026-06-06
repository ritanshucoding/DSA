class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int n= nums.length;
        for(int num:nums){
            arr.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!arr.contains(i))
            arr1.add(i);
        }
        return arr1;
    }
}