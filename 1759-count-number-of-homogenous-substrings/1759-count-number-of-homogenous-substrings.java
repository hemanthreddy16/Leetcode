class Solution {
    public int countHomogenous(String s) {
        long sum = 1;
        long c = 1;
        int MOD = 1000000007;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                c++;
            } else {
                c = 1;
            }

            sum = (sum + c) % MOD;
        }

        return (int) sum;
    }
}