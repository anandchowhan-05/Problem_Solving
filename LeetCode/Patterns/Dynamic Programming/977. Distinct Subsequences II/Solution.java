class Solution {
    public int distinctSubseqII(String s) {
        int mod=1000000007;
        int n=s.length();
        long ans=1;
        long[] last=new long[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int index= ch - 'a';
            long prev=ans;
            ans = (2*ans-last[index]+mod)%mod;
            last[index]=prev%mod;
        }
        return (int)ans-1;
    }
}