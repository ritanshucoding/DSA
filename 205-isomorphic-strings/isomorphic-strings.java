class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr1= new char[128];
        char[] arr2 = new char[128];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (arr1[ch1] == '\0' && arr2[ch2] == '\0'){
            arr1[ch1]=ch2;
            arr2[ch2]=ch1;
            }else{
        if(arr1[ch1]!=ch2 || arr2[ch2]!=ch1) return false;
        }
        }
        return true;
    }
}