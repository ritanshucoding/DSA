class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            String s = String.valueOf(num);
        for(int i=0;i<s.length();i++){
            arr.add(s.charAt(i)-'0');
        }
        }
        int [] a = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}