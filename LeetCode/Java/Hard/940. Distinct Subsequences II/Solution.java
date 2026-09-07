class Solution {
    public int distinctSubseqII(String s) {
        int n=s.length();
        int ans=1;
        int prev=1;
        int[] last=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int index= ch - 'a';
            ans = ans*2-last[index];
            last[index]=prev;
            prev=ans;
        }
        return ans-1;
    }
}