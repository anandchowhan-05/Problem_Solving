class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[][] temp = new int[n][2];

        if (n == 1)
            return true;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) temp[i][0] = 1;
            if (nums1[i] % 2 != 0) temp[i][1] = 1;
            else {
                for (int j = 0; j < n; j++) {
                    if (j == i)
                        continue;
                    if ((nums1[i] - nums1[j]) % 2 != 0  && (nums1[i] - nums1[j]) >=1 ) {
                        temp[i][1] = 1;
                        break;
                    }
                }
            }
        }

        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            if (even == 0 && temp[i][0] == 0)
                even = 1;
            if (odd == 0 && temp[i][1] == 0)
                odd = 1;
        }

        return even == 0 || odd == 0;
    }
}