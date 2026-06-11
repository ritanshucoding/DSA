class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int ch= s.charAt(i);
            int ch1 = s.charAt(i+1);
            int ascii = (int)ch;
            int ascii1 = (int)ch1;
            sum+=Math.abs(ascii-ascii1);
        }
        return sum;
    }
}