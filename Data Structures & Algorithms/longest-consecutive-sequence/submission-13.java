class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length ==0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
        }
        
        int max = 1;
       
        for(int i=0; i<nums.length;i++){
           int check = nums[i];
            if(!set.contains(check-1)){
                int maxx = 1;
                while(set.contains(check+1)){ 
                    maxx++;
                    check++;
            }
            max = Math.max(max,maxx);
            }
            
        }
         return max;
        }
       
    }

