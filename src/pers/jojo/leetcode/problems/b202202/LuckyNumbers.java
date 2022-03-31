package pers.jojo.leetcode.problems.b202202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LuckyNumbers
 *
 * @author 张淳
 * @date 2022/2/15 14:32
 * @description https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 */
public class LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] min = new int[m];
        Arrays.fill(min, Integer.MAX_VALUE);
        int[] max = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min[i] = Math.min(min[i], matrix[i][j]);
                max[j] = Math.max(max[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == min[i] && matrix[i][j] == max[j]) {
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}
