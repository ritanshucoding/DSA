class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }int ans=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE-digit)/10){
                if(sign==1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }ans=ans*10+digit;
            i++;
        }
        return ans*sign;
    }
}