class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> hp = new HashMap<>();
    for(int i=0;i<nums.length; i++){
        if(hp.containsKey(nums[i])){
            hp.put(nums[i],hp.get(nums[i])+1);
        }
        else{
            hp.put(nums[i],1);
        }
    }
    
    List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hp.entrySet());
    list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
    int[] ans = new int[k];
    for(int i=0;i<k;i++){
        ans[i] = list.get(i).getKey();
    }
    return ans;
    }
}
