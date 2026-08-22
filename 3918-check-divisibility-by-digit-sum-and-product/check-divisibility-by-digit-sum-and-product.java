class Solution {
    public boolean checkDivisibility(int num) {
        int temp=num;
        int sum=0;
        int pro=1;
        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            pro*=digit;
            temp/=10;
        }
        return num%(sum+pro)==0;
    }
}