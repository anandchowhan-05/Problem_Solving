class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(set.contains(original)){
                original = 2*original;
            }else{
                return original;
            }
        }
        return original;
    }
}