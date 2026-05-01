class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr = new HashSet<>();
        for(int ele:nums1){
            arr.add(ele);
        }
        HashSet<Integer> arr1 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(arr.contains(nums2[i])){
                arr1.add(nums2[i]);
            }
        }
        Integer[] temp = arr1.toArray(new Integer[0]);
        int[] arr2 = new int[temp.length];
        for(int i = 0; i < temp.length; i++){
            arr2[i] = temp[i];
        }
        return arr2;
    }
}