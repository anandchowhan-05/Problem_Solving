class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums[n-1]+k;i++){
            if(!set.contains(i) && i%k==0){
                return i;
            }
        }
        return -1;
    }
}