class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k) {
            String b = "";

            for(int i = 0; i < s.length(); i = i + k) {
                String str = s.substring(i, Math.min(i + k, s.length()));

                int d = 0;

                for(int j = 0; j < str.length(); j++) {
                    d = d + (str.charAt(j) - '0');
                }

                b = b + d;
            }

            s = b;
        }

        return s;
    }
}