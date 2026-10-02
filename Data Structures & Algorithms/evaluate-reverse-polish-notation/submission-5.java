class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<tokens.length;i++){
        String c = tokens[i];
        if(c.equals("+") || c.equals("-") || c.equals("*") ||  c.equals("/")){
            int a = st.pop();
            int b = st.pop();
            switch(c){
                case "+":
                st.push(a+b);
                break;

                case "-":
                st.push(b-a);
                break;

                case "*":
                st.push(a*b);
                break;

                case "/":
                st.push(b/a);
                break;
            }
        }
        else{
            st.push(Integer.parseInt(c));
        }
       
      }
      return st.pop();
    }  
    
    }

