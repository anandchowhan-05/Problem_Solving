class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums2[i]);
        }
        for(int i=0;i<nums2.length;i++){
            s2.add(nums1[i]);
        }
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!s1.contains(nums1[i])){
                list1.add(nums1[i]);
                s1.add(nums1[i]);
            }
        }
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(!s2.contains(nums2[i])){
                list2.add(nums2[i]);
                s2.add(nums2[i]);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}