import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) { 
            char ch = s.charAt(i);
            if (st.size() == 0) {
                st.push(ch);
            } else if (st.peek() != ch) {
                st.push(ch);
            }
            else{
            st.pop();}
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            char ch = st.peek();
            st.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
}
