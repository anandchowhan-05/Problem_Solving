class Solution {
    public long findKthSmallest(int[] coins, int k) {
        TreeSet<Long> set = new TreeSet<>();
        Arrays.sort(coins);
        for(int i=1;i<=k;i++){
            for(int j=0;j<coins.length;j++){
                set.add((long)coins[j]*i);
            }
        }
        Iterator<Long> it = set.iterator();
        for(int i1 = 1; i1 < k; i1++) {
            it.next();
        }
        return it.next();
    }
}