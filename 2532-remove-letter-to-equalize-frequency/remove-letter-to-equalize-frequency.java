class Solution {
    public boolean equalFrequency(String word) {
        int [] freq = new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                continue;
            }
            freq[i]--;
            int count=0;
            int frequency=0;
            boolean equal=true;
            for(int j=0;j<26;j++){
                if(freq[j]>0){
                    if(frequency==0){
                        frequency=freq[j];
                    }else if(frequency!=freq[j]){
                        equal=false;
                        break;
                    }
                    count++;
                }
            }
            freq[i]++;
            if(equal){
                 return true;
            }
        }
        return false;
    }
}