class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int msk = (1<<i);
            if((n&msk)!=0) count++;
        }
        return count;
    }
}