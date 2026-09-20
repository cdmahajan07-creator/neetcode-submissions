class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int a = i-map.get(nums[i]);
            map.put(nums[i],i);
            if(a<=k) return true;
        }
        else{
            map.put(nums[i],i);
        }
    }
    return false;
    }
}