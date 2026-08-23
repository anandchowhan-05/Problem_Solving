class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String binary = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
            sb.append(binary);
        }
        String str=sb.toString();
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}