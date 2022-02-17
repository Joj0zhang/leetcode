package pers.jojo.leetcode.problems;

/**
 * KnightProbability
 *
 * @author 张淳
 * @date 2022/2/17 14:06
 * @description https://leetcode-cn.com/problems/knight-probability-in-chessboard/
 */
public class KnightProbability {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] choices = new int[][]{{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        double[][][] dp = new double[n][n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = 1;
            }
        }
        for (int step = 1; step <= k; step++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] choice : choices) {
                        int ni = i + choice[0];
                        int nj = j + choice[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            dp[i][j][step] += dp[ni][nj][step - 1] / 8;
                        }
                    }
                }
            }
        }
        return dp[row][column][k];
    }
}
