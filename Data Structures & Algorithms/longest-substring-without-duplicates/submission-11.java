class Solution {
    public int lengthOfLongestSubstring(String s) {
    {
    HashMap<Character, Integer> hs = new HashMap<>();
int left = 0;
int max = 0;

for (int right = 0; right < s.length(); right++) {

    if (hs.containsKey(s.charAt(right))) {
        left = Math.max(left, hs.get(s.charAt(right)) + 1);
    }

    hs.put(s.charAt(right), right);
    max = Math.max(max, right - left + 1);
}
return max;
    }    
    
    }
}
