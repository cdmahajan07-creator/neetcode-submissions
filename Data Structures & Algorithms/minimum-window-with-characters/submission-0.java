class Solution {
    public String minWindow(String s, String t) {
    
    if(t.length()>s.length()){
        return "";
    }

    HashMap<Character,Integer> need = new HashMap<>();
    HashMap<Character,Integer> window = new HashMap<>();

    for(int i=0;i<t.length();i++){
        char c = t.charAt(i);
        need.put(c,need.getOrDefault(c,0)+1);
    }

    int left = 0;
    int formed = 0;
    int minLength = Integer.MAX_VALUE;
    int start = 0;

    for(int right =0; right<s.length() ; right++){
        char c = s.charAt(right);
        window.put(c,window.getOrDefault(c,0)+1);

        if(need.containsKey(c) && window.get(c).equals(need.get(c))){
            formed++;
        }

        while(formed == need.size()){

            if(right-left+1 < minLength){
                minLength = right-left+1;
                start = left;
            }

            char remove = s.charAt(left);

            window.put(remove,window.get(remove)-1);

            if(need.containsKey(remove) &&
            window.get(remove)<need.get(remove)){
                formed--;
            }

            left++;
        }
    }
    if (minLength == Integer.MAX_VALUE) {
            return "";
        }
           return s.substring(start,start+minLength);
    }
 
    }

