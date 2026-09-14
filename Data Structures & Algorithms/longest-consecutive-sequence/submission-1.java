class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int maxx = 0;
        int i=0;
        if(nums.length == 0)return 0;
        for( i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                maxx++;
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                maxx =0;
            }
            max = Math.max(max,maxx);
        }
        return max+1;
    }
}
