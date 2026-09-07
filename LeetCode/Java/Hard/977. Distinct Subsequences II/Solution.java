class Solution {
    public int distinctSubseqII(String s) {
        int mod=1000000007;
        int n=s.length();
        int ans=1;
        int prev=1;
        int[] last=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int index= ch - 'a';
            ans = (ans*2-last[index])%mod;
            last[index]=prev%mod;
            prev=ans%mod;
        }
        return ans-1;
    }
}