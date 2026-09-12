class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int m=1;
        for(int i=1;i<=n;i++){
            int day=(i-1)%7;
            ans+=m+day;
            if(day==6){
                m++;
            }
        }
        return ans;
    }
}