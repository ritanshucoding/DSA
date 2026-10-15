class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            boolean[] a = new boolean[101];
            int dist=0;
            for(int j=i;j<n;j++){
                if(!a[nums.get(j)]){
                    a[nums.get(j)]=true;
                    dist++;
                }
                sum+=dist*dist;
            }
        }
        return sum;
    }
}