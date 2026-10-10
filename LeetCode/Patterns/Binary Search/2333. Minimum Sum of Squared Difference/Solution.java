class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] m = new int[n];
        long x = (long) k1 + k2;

        for (int i = 0; i < n; i++) {
            m[i] = Math.abs(nums1[i] - nums2[i]);
        }

        while (x > 0) {
            Arrays.sort(m);

            int maxIndex = n - 1;

            if (m[maxIndex] == 0) {
                break;
            }

            m[maxIndex]--;
            x--;
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long) m[i] * m[i];
        }

        return ans;
    }
}