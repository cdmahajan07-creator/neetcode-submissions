class Solution {
    public int firstMissingPositive(int[] nums) {
    
    int lowest = nums[0];
    int highest = nums[0];

    for(int i=0;i<nums.length;i++){
        if(nums[i]<lowest){
            lowest = nums[i];
        }
        if(nums[i]>highest){
            highest = nums[i];
        }
    }
    if(lowest>1) return 1;
    if(highest<0) return 1;
    HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<nums.length;i++){
       hs.add(nums[i]); 
    }
    for(int i= 0;i<=highest;i++){
        if(!hs.contains(i)){
            if(i>0){
                return i;
            }
            continue;
        }
    }
    return highest+1;
    }
}