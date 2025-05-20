class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<Character>();

        int N  = s.length();
        for(int i =0;i<N;i++){
            char ch = s.charAt(i);
         if(ch =='{'|| ch =='['||ch =='('){
            st.push(ch);
         }
         else{
            if(st.size()==0){return false;}
            else if ( st.peek()=='{' && ch =='}'){
                st.pop();
            }
             else if ( st.peek()=='[' && ch ==']'){
                st.pop();
            }
            else if ( st.peek()=='('&& ch ==')'){
                st.pop();
            }
            else{
                return false;
            }
         }
        }

        if(st.size()==0){
            return true;
        }
        return false;
    }
}