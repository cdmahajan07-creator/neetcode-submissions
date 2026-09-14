class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
            sb.append("#");
            sb.append(strs.get(i));
        }
        String s = sb.toString();
         return s;
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
       // StringBuffer sb = new StringBuffer("");
        int i=0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            StringBuffer sb = new StringBuffer();
            for(int a = j+1 ;a<j+1+len ;a++){
                sb.append(str.charAt(a));
            }
            lst.add(sb.toString());
           
            i = j+1+len;
        }
        return lst;
        }
}


