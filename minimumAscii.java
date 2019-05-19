import java.util.*;

class MinimumAscii {
    static String s1 = "delete", s2 = "leet";

    public static int dp[][];

    public static void main(String[] args) {
        int N = s1.length();
        int M = s2.length();
        dp = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(minDelete(0, 0));
    }

    public static int minDelete(int i, int j) {

        if (i >= s1.length())
            return sumOfASCII(s2.substring(j));
        if (j >= s2.length())
            return sumOfASCII(s1.substring(i));
        if (dp[i][j] != -1)
            return dp[i][j];

        int res = 0;
        if (s1.charAt(i) == s2.charAt(j))
            res = minDelete(i + 1, j + 1);
        else {
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(j);
            res = Math.min(c1 + minDelete(i + 1, j), c2 + minDelete(i, j + 1));
        }
        dp[i][j] = res;
        return res;

    }

    public static int sumOfASCII(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            sum += s.charAt(i);
        }
        return sum;
    }
}