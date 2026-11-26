class Solution {
    public boolean canAliceWin(int n) {
     if(n<10) return false;
     boolean isValue=false;
     int x=10;
     while(n>=x){
        if(x%2==0){
            n=n-x;
            isValue=true;
        }else{
            n=n-x;
            isValue=false;
        }
        x--;
     } 
     return isValue;  
    }
}