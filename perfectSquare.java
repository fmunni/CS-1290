import java.util.*;

class PerfectSquare {

    public static int dp[];

    public static void main(String[] args) {
        int N = 12;
        dp = new int[N + 1];

        System.out.println(minimumNumberOfPerfectSquare(N));

    }

    static int minimumNumberOfPerfectSquare(int N) {
        if (N == 0)
            return 0;
        if (dp[N] > 0)
            return dp[N];
        int res = N;
        for (int i = 1; i * i <= N; i++)
            res = Math.min(res, 1 + minimumNumberOfPerfectSquare(N - i * i));
        dp[N] = res;
        return res;

    }

}