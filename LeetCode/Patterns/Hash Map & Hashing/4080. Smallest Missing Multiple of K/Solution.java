class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
       int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=1;i<=max+k;i++){
            if(!set.contains(i) && i%k==0){
                return i;
            }
        }
        return -1;
    }
}