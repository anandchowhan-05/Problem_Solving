class Solution {
    public long countCommas(long n) {
        if(n<1000l) return 0;
        long ans=0;
        if(n >=1000000l){
            ans +=999900l;
        }else{
            return n-999l;
        }
        if(n>=1000000000l){
            ans += (999999999l-1000000l)*2;
        }else{
            long value=(n-999999l)*2;
            return ans+value;
        }
        if(n>=1000000000000l){
            ans += (999999999999l-1000000000l)*3;
        }else{
            long value=(n-999999999l)*3;
            return ans+value;
        }
        if(n>=1000000000000000l){
            ans += (999999999999999l-1000000000000l)*4;
        }else{
            long value=(n-999999999999l)*4;
            return ans+value;
        }
        if(n==1000000000000000l) return ans+5;
        return ans;
    }
}