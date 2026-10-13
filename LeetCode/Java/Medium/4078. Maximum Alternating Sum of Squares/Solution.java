class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int j=0;
        long answer=0;
        for(int i=1;i<n;i=i+2){
            answer = answer - (long)Math.pow(nums[j++],2);
        }
        for(int i=0;i<n;i=i+2){
            answer = answer + (long)Math.pow(nums[j++],2);
        }
        return answer;
    }
}