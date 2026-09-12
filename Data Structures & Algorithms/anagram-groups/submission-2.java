class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ab = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String n = new String(arr);
            if(ab.containsKey(n)){
                ab.get(n).add(s);
            }
            else{
                List<String> lst = new ArrayList<>();
                lst.add(strs[i]);
                ab.put(n,lst);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String str : ab.keySet()){
            ans.add(ab.get(str));
        }
        return ans;
    }
}
