class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        int ans=0;
        while(x!=0){
            int d=x%10;
            ans=ans*10+d;
            x /=10;
        }
        return ans==temp;
    }
}