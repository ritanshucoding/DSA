class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:order){
            for(int j:friends){
            if(i==j)
            arr.add(i);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}