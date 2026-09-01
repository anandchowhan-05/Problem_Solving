class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        for(int i=1;i<=100;i++){
            for(int j=0;j<nums.length-1;j++){
                if((nums[j]==nums[j+1]) && nums[j]==i){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}