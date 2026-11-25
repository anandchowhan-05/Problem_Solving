class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int x=mainTank/5;
        int ans=mainTank*10;
        if(x>additionalTank){
            ans += additionalTank*10;
        }else{
            ans += x*10;
        }
        return ans;
        
    }
}