import java.util.Arrays;

class Solution {
    public int dominantPairs(int[] arr) {
        int n = arr.length;
        int half = n / 2;

        int[] a = Arrays.copyOfRange(arr, 0, half);
        int[] b = Arrays.copyOfRange(arr, half, n);

        Arrays.sort(a);
        Arrays.sort(b);

        int j = 0;
        int count = 0;

        for (int i = 0; i < half; i++) {

            while (j < half && a[i] >= 5L * b[j]) {
                j++;
            }

            count += j;
        }

        return count;
    }
}