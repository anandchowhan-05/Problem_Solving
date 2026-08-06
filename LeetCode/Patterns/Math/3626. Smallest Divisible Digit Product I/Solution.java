class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        for (int i = 0; i <= 10; i++) {
            int ans = 1;
            int num = temp + i;
            int x = num;
            while (x != 0) {
                int d = x % 10;
                ans *= d;
                x /= 10;
            }
            if (ans % t == 0) {
                return num;
            }
        }
        return -1;
    }
}