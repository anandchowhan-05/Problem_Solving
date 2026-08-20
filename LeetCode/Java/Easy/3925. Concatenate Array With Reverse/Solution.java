class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] a=new int[2*n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
            a[2*n-1-i]=nums[i];
        }
        return a;
    }
}