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
        // for(int i=0;i<n;i++){
        //     if(nums[i]%2==0){
        //         nums[i]=odd;
        //         odd--;
        //     }else{
        //         nums[i]=even;
        //         even--;
        //     }
        // }
        int[] b=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                b[i]=odd;
                even--;
            }else{
                b[i]=even;
                odd--;
            }
        }
        return b;
    }
}