class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(),word2.length());
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<min;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length()==min){
                sb.append(word2.substring(min,word2.length()));
                return sb.toString();
            }
        else if(word2.length()==min){
                sb.append(word1.substring(min,word1.length()));
                return sb.toString();
            }
        else
        return sb.toString();
    }
}