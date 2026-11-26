class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && st.peek() > ch){
                if(k==0) break;  
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k != 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            if (sb.length() == 0 && ch == '0') {
                continue;
            }
            sb.append(ch);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}