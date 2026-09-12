class Solution {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            int square=i*i;
            if(check(square,i)){
                ans+=square;
            }
        }
        return ans;
    }
    public boolean check(int square, int target){
        if(square==target){
            return true;
        }
        if(square==0){
            return false;
        }
        int temp=square;
        int i=10;
        while(temp/i>0){
            int right=square%i;
            int left=square/i;
            if(check(left,target-right)){
                return true;
            }
            i*=10;
        }
        return false;
    }
}