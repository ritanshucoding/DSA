class Solution {
    public int evalRPN(String[] tokens) {
        int[] num= new int[tokens.length];
        char[] op= new char[tokens.length];
        int ntop=-1;
        int otop=-1;
        for(String t:tokens){
            if(!t.equals("+") && !t.equals("-") && !t.equals("*") && !t.equals("/")){
                num[++ntop]=Integer.parseInt(t);
            }
            else{
                op[++otop]=t.charAt(0);
                char operator=op[otop--];
                int b = num[ntop--];
                int a = num[ntop--];
                int result=0;
                if(operator=='+'){
                    result=a+b;
                }else if(operator=='-'){
                    result=a-b;
                }else if(operator=='*'){
                    result=a*b;
                }else if(operator=='/'){
                    result=a/b;
                }
                num[++ntop]=result;
            }
        }
        return num[ntop];
    }
}