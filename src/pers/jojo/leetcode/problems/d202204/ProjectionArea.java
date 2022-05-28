package pers.jojo.leetcode.problems.d202204;

/**
 * ProjectionArea
 *
 * @author 张淳
 * @date 2022/4/26 16:00
 * @description https://leetcode-cn.com/problems/projection-area-of-3d-shapes/
 */
public class ProjectionArea {
    public int projectionArea(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    ans++;
                }
                x[i] = Math.max(x[i], grid[i][j]);
                y[j] = Math.max(y[j], grid[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            ans += x[i] + y[i];
        }
        return ans;
    }
}
