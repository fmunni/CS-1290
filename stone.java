import java.util.*;
import java.math.*;

class Stone {
    public static int stones[] = { 5, 3, 4, 5 };

    public static int dp[][];

    public static void main(String[] args) {
        int N = stones.length;
        dp = new int[N][N];

        int alex = maxStones(0, N - 1);
        System.out.println(alex > sum(0, N - 1) / 2);
    }

    public static int maxStones(int i, int j) {

        if (i > j)
            return 0;
        if (dp[i][j] > 0)
            return dp[i][j];

        dp[i][j] = Math.max(sum(i, j) - maxStones(i + 1, j), sum(i, j) - maxStones(i, j - 1));
        return dp[i][j];

    }

    public static int sum(int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++)
            s += stones[k];
        return s;
    }
}