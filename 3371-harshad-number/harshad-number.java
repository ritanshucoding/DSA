class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int org=x;
        while(x!=0){
            int n=x%10;
            sum+=n;
            x=x/10;
        }
        if(org%sum==0){
        return sum;
        }
        return -1;
    }
}