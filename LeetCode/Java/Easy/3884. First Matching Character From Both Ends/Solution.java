class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
            for(int i=0;i<n/2;i++){
                if(s.charAt(i) == s.charAt(n-1-i)){
                    return i;
                }
            }
        if(n%2 != 0){
            return n/2;
        }
        return -1;
    }
}