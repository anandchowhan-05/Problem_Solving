class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0, maxOnLeft = values[0];
        for (int i = 1; i < values.length;i++) {
            max = Math.max(max, maxOnLeft + values[i] - i);
            maxOnLeft = Math.max(maxOnLeft, values[i] + i);
        }
        return max;
    }
}