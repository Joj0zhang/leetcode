package pers.jojo.leetcode.problems.d202205;

/**
 * FindKthNumber
 *
 * @author 张淳
 * @date 2022/5/18 9:27
 * @description https://leetcode.cn/problems/kth-smallest-number-in-multiplication-table/
 */
public class FindKthNumber {
    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        while (left < right) {
            int x = left + (right - left) / 2;
            int count = x / n * n;
            for (int i = x / n + 1; i <= m; ++i) {
                count += x / i;
            }
            if (count >= k) {
                right = x;
            } else {
                left = x + 1;
            }
        }
        return left;
    }
}
