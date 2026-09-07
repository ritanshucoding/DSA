class Solution {
    public String[] uncommonFromSentences(String S1, String S2) {
        HashMap<String, Integer> map = new HashMap<>();
for (String word: S1.split(" ")){
map.put(word, map.getOrDefault (word,0)+1);
}
for (String word: S2.split(" ")){
map.put(word, map.getOrDefault (word,0)+1);
}
List<String> ans = new ArrayList<>();
for (String word: S1.split(" ")){
if(map.get(word)==1){
ans.add(word);
}
}
for (String word: S2.split(" ")){
if(map.get(word)==1){
ans.add(word);
}
}
return ans.toArray(new String[0]);
    }
}