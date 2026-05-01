class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int ele: nums){
        if(arr.containsKey(ele)){
            arr.put(ele,arr.get(ele)+1);
        }else{
            arr.put(ele,1);
        }
        }
        int maxfreq=0;
        for(int freq : arr.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }
        int ans = 0;
        for(int freq : arr.values()) {
            if(freq == maxfreq) {
                ans += freq;
            }
        }
        return ans;
    }
}