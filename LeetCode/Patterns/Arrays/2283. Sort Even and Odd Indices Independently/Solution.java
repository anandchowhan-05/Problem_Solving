class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] a=new int[nums.length/2];
        int[] b=new int[nums.length-(nums.length)/2];
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                b[k++]=nums[i];
            }else{
                a[j++]=nums[i];
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            nums[(i*2)+1] = a[a.length-i-1];        }
        for(int i=0;i<b.length;i++){
            nums[i*2]=b[i];
        }
        return nums;
    }
}