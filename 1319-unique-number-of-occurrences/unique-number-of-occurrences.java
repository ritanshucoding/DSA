class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key: arr){
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key,freq+1);
            }
            else map.put(key,1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val:map.values()){
            set.add(val);
        } 
        return set.size()==map.size();
           }
}