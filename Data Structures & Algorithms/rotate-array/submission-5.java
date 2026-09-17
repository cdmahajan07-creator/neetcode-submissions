class Solution {
    public void reverse(int[] nums,int a,int b){
        while(a<b){
            int temp = nums[a];
            nums[a]  = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
    public void rotate(int[] nums, int k) {
    if(k>nums.length){
        k = k%nums.length;
    }
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
    }
}