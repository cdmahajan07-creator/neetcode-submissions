class Solution {
    public boolean checkInclusion(String s1, String s2) {
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0; i<s1.length(); i++){
        char  c = s1.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }
    int left = 0;
    int right  = s1.length();
    while(right<=s2.length()){
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=left;i<right;i++){
            char c = s2.charAt(i);
            hp.put(c,hp.getOrDefault(c,0)+1);
        }
        if(map.equals(hp)){
            return true;
        }
        else{
            hp.put(s2.charAt(left),hp.get(s2.charAt(left)-1));
            left++;
            right++;
        }
    }
    return false;
    }
}
