class Solution {
    public double minPrice(int[] prices, int[] discounts) {
       double sum=0.0;
       int x=prices.length;
       int y=discounts.length;

       int n=Math.min(x,y);
       Arrays.sort(prices);
       Arrays.sort(discounts);
       if(x > y){
        int b=x-y;
            for(int i=prices.length-1;i>=prices.length-n;i--){
                sum += (prices[i]*(100-discounts[i-b]))/100.0;
            }
            for(int i=0;i<prices.length-n;i++){
                sum +=prices[i];
            }
       }else if(x<y){
            int b=y-x;
         for(int i=y-1;i>=y-n;i--){
                sum += (prices[i-b]*(100-discounts[i]))/100.0;
            }   
       }else{
        for(int i=prices.length-1;i>=prices.length-n;i--){
                sum += (prices[i]*(100-discounts[i]))/100.0;
            }
       }
       return sum; 
    }
}