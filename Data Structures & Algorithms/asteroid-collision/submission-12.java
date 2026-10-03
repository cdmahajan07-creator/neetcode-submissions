class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<asteroids.length;i++){
        int a = asteroids[i];
        if(!st.isEmpty() && st.peek()>0 && a>0){
            st.push(a);
        }
        else if (a>0){
            st.push(a);
        }
        else{
            if(!st.isEmpty() && st.peek()>(-a)){
                continue;
            }
            else if(!st.isEmpty() && st.peek() == (-a)){
                st.pop();
            }
            else if(st.isEmpty()){
                st.push(a);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 &&st.peek()<(-a)){
                st.pop();    
                }
               if(st.isEmpty()){
                st.push(a);
               }
               else if(st.peek() == -a){
                    st.pop();
               }
               else if(st.peek()<0){
                st.push(a);
               }
        }
    }
    
    }
    int[] ans = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ans[i] = st.pop();
        }
    return ans;
    }

}