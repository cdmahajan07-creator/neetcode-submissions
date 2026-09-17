class Solution {
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a]  = nums[b];
        nums[b] = temp;
    }
    public int removeDuplicates(int[] nums) {
    int a =0;
    int b= 1;
    while(b<nums.length){
        if(nums[b] == nums[a]){
            b++;
        }
        else if(nums[b] != nums[a]){
            swap(nums,a+1,b);
            a++;
            b++;
        }
    }
    return a+1;
    }
}