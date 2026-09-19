class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        if(i > 0 && nums[i] == nums[i-1]) {
        continue;
        }
       int a = i+1;
       int b = nums.length-1;
       while(a<b){
          if((nums[i]+nums[a]+nums[b])==0){
             List<Integer> l = new ArrayList<>();
            l.add(nums[i]);
            l.add(nums[a]);
            l.add(nums[b]);
            if(!ans.contains(l)){
                ans.add(l);
            }
            a++;
            b--;
          }
          else if((nums[i]+nums[a]+nums[b])>0){
            b--;
             }
             else
            a++;
          }
        }
        return ans;
    }
    
}


        
