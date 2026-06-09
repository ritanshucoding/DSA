class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first=findfirst(nums,target);
       int last=findlast(nums,target);
       return new int[]{first,last};
    }
    public int findfirst(int[]nums, int target){
        int ans=-1;
       int i=0;
       int j=nums.length-1;
       while(i<=j){
        int mid=(i+j)/2;
        if(nums[mid]==target){
            ans=mid;
            j=mid-1;
        }else if(nums[mid]>target){
            j=mid-1;
        }else{
            i=mid+1;
        }
       } 
       return ans;
    }
    public int findlast(int[]nums, int target){
        int ans=-1;
       int i=0;
       int j=nums.length-1;
       while(i<=j){
        int mid=(i+j)/2;
        if(nums[mid]==target){
            ans=mid;
            i=mid+1;
        }else if(nums[mid]>target){
            j=mid-1;
        }else{
            i=mid+1;
        }
       } 
       return ans;
    }
}