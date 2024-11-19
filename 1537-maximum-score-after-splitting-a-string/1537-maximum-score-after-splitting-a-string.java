public class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int zeros = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    zeros++;
                }
            }

            int ones = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                }
            }

            res = Math.max(res, zeros + ones);
        }

        return res;
    }
}