class Solution {
    public int subarraySum(int[] nums, int k) {
    
    HashMap<Integer,Integer> hp = new HashMap<>();
    hp.put(0,1);
    int ans = 0;
    int sum = 0;

    for(int i : nums){
      sum += i;

      if(hp.containsKey(sum-k)){
        ans += hp.get(sum-k);
      }

      hp.put(sum,hp.getOrDefault(sum,0)+1);
          }
     return ans;  
    }
   
}
