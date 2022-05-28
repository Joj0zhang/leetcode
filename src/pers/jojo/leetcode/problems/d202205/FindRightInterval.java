package pers.jojo.leetcode.problems.d202205;

import java.util.Arrays;

/**
 * FindRightInterval
 *
 * @author 张淳
 * @date 2022/5/20 14:42
 * @description https://leetcode.cn/problems/find-right-interval/
 */
public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < intervals.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[i][1] <= intervals[j][0] && min > intervals[j][0]) {
                    min = intervals[j][0];
                    res[i] = j;
                }
            }
        }
        return res;
    }
}
