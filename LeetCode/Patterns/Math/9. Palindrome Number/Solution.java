class Solution {
    public boolean isPalindrome(int x) {
     if(x<0){
        return false;
     }  
     int original=x; 
     int re=0;
     while(x!=0){
        int d=x%10;
        re =re*10+d;
        x /=10;
     }
     return original==re;
    }
}