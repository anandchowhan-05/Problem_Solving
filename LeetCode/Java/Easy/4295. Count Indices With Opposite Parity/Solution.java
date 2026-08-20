class Solution {
    public int[] countOppositeParity(int[] nums) {
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=odd;
                even--;
            }else{
                nums[i]=even;
                odd--;
            }
        }
        return nums;
    }
}