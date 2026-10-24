class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int a = getDay(arriveAlice);
        int b = getDay(leaveAlice);
        int c = getDay(arriveBob);
        int d = getDay(leaveBob);

        int start = Math.max(a, c);
        int end = Math.min(b, d);

        return Math.max(0, end - start + 1);
    }

    private int getDay(String date) {
        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}