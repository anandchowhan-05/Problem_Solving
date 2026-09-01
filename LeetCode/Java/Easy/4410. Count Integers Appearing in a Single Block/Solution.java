class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;

        for (int x = 1; x <= 100; x++) {
            int first = -1;
            int last = -1;
            int occurrences = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == x) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                    occurrences++;
                }
            }

            if (first == -1) continue;

            boolean special = true;

            for (int i = first; i <= last; i++) {
                if (nums[i] != x) {
                    special = false;
                    break;
                }
            }

            if (special) {
                count++;
            }
        }

        return count;
    }
}