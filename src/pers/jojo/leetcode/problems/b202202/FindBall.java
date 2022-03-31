package pers.jojo.leetcode.problems.b202202;

/**
 * FindBall
 *
 * @author 张淳
 * @date 2022/2/24 10:23
 * @description https://leetcode-cn.com/problems/where-will-the-ball-fall/
 */
public class FindBall {
    int m;
    int n;
    int[][] g;

    public int[] findBall(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        g = grid;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = check(i, 0);
        }
        return res;
    }

    private int check(int x, int y) {
        if (y == m) {
            return x;
        }
        if (g[y][x] == 1) {
            if (x == n - 1 || g[y][x + 1] == -1) {
                return -1;
            } else {
                return check(x + 1, y + 1);
            }
        } else {
            if (x == 0 || g[y][x - 1] == 1) {
                return -1;
            } else {
                return check(x - 1, y + 1);
            }
        }
    }
}
