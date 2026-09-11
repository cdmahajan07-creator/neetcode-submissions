class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hp = new HashMap<>();
    
    for(int i=0; i<nums.length; i++){
        int tgt = target - nums[i];

        if(hp.containsKey(tgt)){
            return new int[]{hp.get(tgt),i};
        }
        hp.put(nums[i],i);
    }
    return new int[]{} ;
    }
}
