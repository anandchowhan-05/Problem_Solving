class Solution {

    public String licenseKeyFormatting(String s, int k) {

        StringBuilder sb = new StringBuilder();

        // Remove '-' and convert to uppercase
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                sb.append(Character.toUpperCase(ch));
            }
        }

        // If there are no characters
        if (sb.length() == 0) {
            return "";
        }

        int first = sb.length() % k;

        if (first == 0) {
            first = k;
        }

        StringBuilder ans = new StringBuilder();

        ans.append(sb.substring(0, first));

        for (int i = first; i < sb.length(); i += k) {
            ans.append('-');
            ans.append(sb.substring(i, Math.min(i + k, sb.length())));
        }

        return ans.toString();
    }
}