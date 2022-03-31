package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName MaxCount
 * @Description https://leetcode-cn.com/problems/range-addition-ii/
 * @Author 张淳
 * @Date 2021/11/7 14:48
 * @Version 1.0.0
 **/
public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++) {
            m = Math.min(ops[i][0], m);
            n = Math.min(ops[i][1], n);
        }
        return m * n;
    }
}