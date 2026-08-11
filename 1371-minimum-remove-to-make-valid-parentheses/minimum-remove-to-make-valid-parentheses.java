class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i= 0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else if(ch== ')'){
                if(stack.isEmpty()){
                    sb.setCharAt(i,'#');
                }else {
                    stack.pop();
                }
            }
        }while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(),'#');
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i< sb.length();i++) {
            if(sb.charAt(i) != '#'){
                ans.append(sb.charAt(i));
            }
        }
        return ans.toString();
    }
}