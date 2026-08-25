class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(cost.length==2) return cost[0]>cost[1]?cost[1]:cost[0];
        if(cost.length==3) return cost[0]+cost[2]<cost[1]?cost[0]+cost[2]:cost[1];
        // int i=1;
        // int j=2;
        // int a=cost[0];
        // int b=cost[1];
        // while(i<n-2){
        //     if(cost[i]>cost[i+1]){
        //         a +=cost[i+1];
        //         i=i+1;
        //     }else if(cost[i]==cost[i+1]){
        //         a +=cost[i+1];
        //         i=i+1;
        //     }else {
        //         a +=cost[i];
        //     }
        //     i++;
        // }
        // while(j<n-2){
        //     if(cost[j]>cost[j+1]){
        //         b +=cost[j+1];
        //         j=j+1;
        //     }else if(cost[j]==cost[j+1]){
        //         b +=cost[j+1];
        //         j=j+1;
        //     }else{
        //         b +=cost[j];
        //     }
        //     j++;
        // }
        // int x=Math.min(cost[n-2],cost[n-1]);
        // int y=Math.min(a,b);
        // return x+y;
        int[] dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}