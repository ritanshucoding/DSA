class Solution {
    public int countElements(int[] arr) {
       int min=Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       int n = arr.length;
       for(int i=0;i<n;i++){
        min=Math.min(min,arr[i]);
        max=Math.max(max,arr[i]);
       }
       int count=0;
       for(int i=0;i<n;i++){
        if(arr[i]<max && arr[i]>min) count++;
       }
       return count;
    }
}