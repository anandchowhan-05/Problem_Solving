class Solution {
    public int minRotations(String s) {
        int ans = Math.min(10-s.charAt(0)-'0',s.charAt(0)-'0');
        for(int i=1;i<s.length();i++){
            int a =Math.max(s.charAt(i-1)-'0',s.charAt(i)-'0');
            int b= Math.min(s.charAt(i-1)-'0',s.charAt(i)-'0');
            int min = Math.min((10-a)+b, a-b);
            ans +=min;
        }
        return ans;
    }
}