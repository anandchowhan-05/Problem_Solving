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
        if(st.isEmpty()) return "0";
        String str = st.stream().map(s -> s.toString()).collect(Collectors.joining(""));
        int
        if(str.charAt(0)=='0') str=str.substring(1,str.length());
        return str;
    }
}