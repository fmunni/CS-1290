import java.util.*;

class FallingPath {
    public static int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    public static int dp[][];
    static final int inf = 1 << 29;

    public static void main(String[] args) {
        int N = A.length;
        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], inf);
        }
        int res = inf;
        for (int col = 0; col < N; col++)
            res = Math.min(res, minFallPath(0, col));
        System.out.println(res);
    }

    public static int minFallPath(int row, int col) {

        if (row >= A.length)
            return 0;
        if (dp[row][col] < inf)
            return dp[row][col];
        int res = inf;

        for (int j = 0; j < A.length; j++) {
            if (Math.abs(col - j) < 2) {
                res = Math.min(res, A[row][col] + minFallPath(row + 1, j));
            }
        }
        dp[row][col] = res;
        return res;

    }

}