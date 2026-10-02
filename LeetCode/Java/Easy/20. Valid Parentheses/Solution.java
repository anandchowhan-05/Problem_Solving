class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        //if(s.charAt(0)==')' || s.charAt(0)== '}' || s.charAt(0)==']') return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')' || ch== '}' || ch==']'){
                if(st.isEmpty()) return false;
                if(ch==')' && st.peek()=='('){
                    st.pop();
                }else if(ch==']' && st.peek()=='['){
                    st.pop();
                }else if(ch=='}' && st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}