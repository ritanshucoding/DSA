class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder(s);
        int k=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.setCharAt(i,vowels.get(k));
                k++;
            }
        }
        return sb.toString();
    }
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}