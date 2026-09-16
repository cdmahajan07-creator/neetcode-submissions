class Solution {
    public int binary(int[] nums,int target,int first,int last){
        if(first>last) return -1;
        int mid = first + (last-first)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return binary(nums,target,mid+1,last);
        }
        
            return binary(nums,target,first,mid-1);
        
        
    }
    public int search(int[] nums, int target) {
      return binary(nums,target,0,nums.length-1);
    }
}
