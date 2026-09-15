class Solution {
    public List<Integer> majorityElement(int[] nums) {
    HashMap<Integer,Integer> hp = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(hp.containsKey(nums[i])){
            hp.put(nums[i],hp.get(nums[i])+1);
        }
        else{
            hp.put(nums[i],1);   
        }  
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i : hp.keySet()){
        if(hp.get(i)>(nums.length/3)){
            list.add(i);
        }
    }
    return list;
    }
}