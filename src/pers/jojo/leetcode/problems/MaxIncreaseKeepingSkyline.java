package pers.jojo.leetcode.problems;

/**
 * @ClassName MaxIncreaseKeepingSkyline
 * @Description https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/
 * @Author 张淳
 * @Date 2021/12/13 09:39
 * @Version 1.0.0
 **/
public class MaxIncreaseKeepingSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int l = grid.length;
        int[] max1 = new int[l];
        int[] max2 = new int[l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                max1[i] = Math.max(max1[i], grid[i][j]);
                max2[i] = Math.max(max2[i], grid[j][i]);
            }
        }
        int result = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                result = result + Math.min(max1[i], max2[j]) - grid[i][j];
            }
        }
        return result;
    }
}