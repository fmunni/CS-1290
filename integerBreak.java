import java.util.*;

class IntegerBreak {

    public static int dp[];

    public static void main(String[] args) {
        int N = 10;
        dp = new int[N + 1];

        System.out.println(maxProductAtleastTwo(N));

    }

    static int maxProductAtleastTwo(int N) {
        int res = 0;
        for (int i = 1; i < N; i++) {
            res = Math.max(res, i * maxProduct(N - i));
        }
        return res;
    }

    static int maxProduct(int N) {
        if (N == 0)
            return 1;
        if (dp[N] > 0)
            return dp[N];
        int res = 0;
        for (int i = 1; i <= N; i++)
            res = Math.max(res, i * maxProduct(N - i));
        dp[N] = res;
        return res;
    }

}