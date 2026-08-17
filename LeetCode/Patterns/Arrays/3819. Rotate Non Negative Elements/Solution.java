class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                count++;
            }
        }
        if(count==0) return nums;
        int[] b=new int[count];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                b[j++]=nums[i];
            }
        }
        int[] c=new int[count];
        k=k%count;
        for(int i=k;i<count;i++){
            c[i-k]=b[i];
        }
        for(int i=0;i<k;i++){
            c[count-k+i]=b[i];
        }
        int z=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                nums[i]=c[z++];
            }
        }
        return nums;
    }
}