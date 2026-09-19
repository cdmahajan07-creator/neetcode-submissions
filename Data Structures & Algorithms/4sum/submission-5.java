class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-3;i++){
        for(int j=i+1;j<nums.length-2;j++){
            int a = j+1;
            int b = nums.length-1;
            while(a<b){
             long sum = (long) nums[i]+nums[j]+nums[a]+nums[b];
                 if(sum>target){
                b--;
            }
            else if(sum<target){
                a++;
            }
            else if(sum == target){
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                l.add(nums[a]);
                l.add(nums[b]);
                if(!ans.contains(l)){
                    ans.add(l);
                }
                a++;
                b--;
            }
            }
        }
    }  
    return ans;
    }
}