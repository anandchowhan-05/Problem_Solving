class Solution {
    public int largestInteger(int[] nums, int k) {
    //   HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
    //   for(int i=0;i<nums.length/2;i++){
    //     if(i < k){
    //         map.put(nums[i],i+1);
    //         map.put(nums[n-1-i],i+1);
    //     }else{
    //       map.put(nums[i],k);
    //       map.put(nums[n-1-i],k);  
    //     }
    //   }
    //   if(map.containsKey(1)){
    //     return map.get(1);
    //   }
    //   return -1;  
    if(n<=2 || nums[0]== nums[n-1]) return -1; 
    int max=Math.max(nums[0],nums[n-1]);
    HashSet<Integer> set=new HashSet<>();
    for(int i=1;i<n-1;i++){
        set.add(nums[i]);
    }
    if(set.contains(nums[0]) && set.contains(nums[n-1])){
        return -1;
    }else if(set.contains(nums[0])){
        return nums[n-1];
    }else if(set.contains(nums[n-1])){
        return nums[0];
    }else{
        return max;
    }

    }
}