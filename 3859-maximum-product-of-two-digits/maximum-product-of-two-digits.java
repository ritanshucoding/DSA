class Solution {
    public int maxProduct(int n){
        int[] digit =new int[10];
        int size=0;
        while(n>0){
            digit[size++]=n%10;
            n/=10;
        }
        int max = 0;
        for (int i=0;i<size;i++) {
            for (int j=i+1;j<size;j++) {
                int pro=digit[i] * digit[j];
                if(pro>max) {
                    max=pro;
                }
            }
        }

        return max;
    }
}