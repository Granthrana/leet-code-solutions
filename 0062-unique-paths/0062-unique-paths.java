class Solution {
    int n, m;
    int[][] dp;
    int path(int i, int j) {
        if (i >= n || j >= m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int right = path(i, j + 1);
        int down = path(i + 1, j);
        return dp[i][j] = right + down;
    }
    public int uniquePaths(int n, int m) {
        this.n = n;
        this.m = m;
        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }
        return path(0, 0);
    }
}