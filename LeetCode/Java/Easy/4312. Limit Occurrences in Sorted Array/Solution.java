class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] a=new int[100];
        for(int i=0;i<nums.length;i++){
            a[nums[i]-1]=a[nums[i]-1]+1;
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>k){
                a[i]=k;
            }
            count += a[i];
        }
        int[] b=new int[count];
        int z=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                for(int j=0;j<a[i];j++){
                    b[z++]=i+1;
                }
            }
        }
        return b; 
    }
}