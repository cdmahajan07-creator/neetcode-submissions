class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int[] temp = temperatures;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[temp.length];
    
    for(int i=0; i<temp.length; i++ ){
      while(!st.isEmpty() && temp[i]>temp[st.peek()]){
        int prev = st.pop();
        ans[prev] = i-prev;
      }
      st.push(i);
      }

     return ans;
    }
}
