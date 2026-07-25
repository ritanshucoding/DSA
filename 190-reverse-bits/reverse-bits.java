class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        while (binary.length()<32){
            binary ="0" +binary;
        }
        char[] arr  = binary.toCharArray();
        int a =0;
        int b = arr.length-1;
        while(a<b){
            char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        binary = new String(arr);
        return (int) Long.parseLong(binary, 2);
    }
}