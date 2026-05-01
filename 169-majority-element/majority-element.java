class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int ele: nums){
            if(arr.containsKey(ele)){
                arr.put(ele,arr.get(ele)+1);
            }
            else{
                arr.put(ele,1);
            }
            for(int key:arr.keySet()){
                if(arr.get(key)>nums.length/2)
                return key;
            }
        }
        return -1;
    }
}