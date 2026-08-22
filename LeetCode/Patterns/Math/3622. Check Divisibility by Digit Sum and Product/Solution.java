class Solution {
    public boolean checkDivisibility(int n) {
        if
        int sum=0;
        int prod=1;
        int temp=n;
        while(n!=0){
            int d=n%10;
            sum=sum+d;
            prod = prod*d;
            n=n/10;
        }
        int res=sum+prod;
        return res%temp==0;
    }
}