class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int[] b=new int[n];
        int m1=nums[0];
        int m2=nums[1];
        a[0]=nums[0];
        b[0]=nums[1];
        int x=1;
        int y=1;
        for(int i=2;i<n;i++){
            if(m1>m2){
                a[x++]=nums[i];
                m1=nums[i];
            }else{
                b[y++]=nums[i];
                m2=nums[i];
            }
        }
        int[] c=new int[n];
        int z=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                c[z++]=a[i];
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                c[z++]=b[i];
            }
        }
        return c;
    }
}