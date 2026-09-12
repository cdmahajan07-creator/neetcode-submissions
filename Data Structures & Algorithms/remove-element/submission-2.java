class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int x = nums.length;
        for(int i=0;i<x;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}