class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
       int[] a=new int[n];
       int k=0;
       while(k<n){
        int prod=1;
        for(int i=0;i<n;i++){
            if(k==i){
                int l=1;
            }else{
                prod=prod*nums[i];
            }
        }
        a[k++]=prod;
       } 
       return a;
    }
}