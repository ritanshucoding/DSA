class Solution {
    public int reverseBits(int n) {
        int i=0;
        int j=31;
        while(i<j){
            int imsk = (1<<i), jmsk = (1<<j);
            boolean ion = ((n&imsk) !=0);
            boolean jon = ((n&jmsk) !=0);
            if(ion!=jon){
                n^=imsk; // ith bit flipped
                n^=jmsk; // jth bit flipped
            }
            i++;
            j--;
        }
        return n;
    }
}