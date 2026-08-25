class Solution {
    public void moveZeroes(int[] nums) {
       if(nums.length==1) System.out.println(nums[0]);
       int n=nums.length;
       int p1=0;
       int p2=1;
       while(p1<n && p2<n){
        if(nums[p1]==0 && nums[p2]!=0){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            p1++;
            p2++;
        }else if(nums[p1]!=0 && nums[p2]==0){
            p2++;
            p1++;
        }else{
            p2++;
        }
       } 
    }
}