class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int[] a=new int[n-k+1];

        int sum=0;
        for(int i=0;i<k;i++){
            sum +=nums[i];
        }
        a[0]=sum;
        int max=sum;
        for(int i=k;i<n;i++){
            a[i-k+1]= a[i-k]-nums[i-k]+nums[i];
            max=Math.max(max,a[i-k+1]);
        }
        return (double) max/k;
    }
}