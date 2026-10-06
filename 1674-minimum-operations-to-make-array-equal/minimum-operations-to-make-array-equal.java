class Solution {
    public int minOperations(int n) {
        int operation=0;
        for(int i=0;i<n/2;i++){
            int left = 2*i+1;
            int right = 2*(n-1-i)+1;
            operation+=(right-left)/2;
        }
        return operation;
    }
}