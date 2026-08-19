class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Stack<Character>stack = new Stack<>();
        boolean[] used=new boolean[26];
        for(char ch:s.toCharArray()) {
            map.put(ch,map.get(ch)-1);
            if(used[ch - 'a']){
                continue;
            }
            while(!stack.isEmpty()&&
                   stack.peek()>ch &&
                   map.get(stack.peek())>0) {
                used[stack.pop() -'a']=false;
            }
            stack.push(ch);
            used[ch-'a'] = true;
        }
        String ans = "";
        while(!stack.isEmpty()) {
            ans=stack.pop()+ans;
        }
        return ans;
    }
}