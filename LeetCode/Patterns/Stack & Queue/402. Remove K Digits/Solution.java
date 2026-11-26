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
        int l=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0') l++;
            else break;
        }
        str=str.substring(l,str.length());
        if(str.length()==0) return "0";
        return str;
    }
}