package pers.jojo.leetcode.problems.d202205;

/**
 * RecentCounter
 *
 * @author 张淳
 * @date 2022/5/6 17:34
 * @description https://leetcode-cn.com/problems/number-of-recent-calls/
 */
public class RecentCounter {
    private int[] calls;
    private int index;

    public RecentCounter() {
        calls = new int[10000];
        index = 0;
    }

    public int ping(int t) {
        calls[index++] = t;
        int i = index - 1;
        while (i >= 0 && calls[i] >= t - 3000) {
            i--;
        }
        return index - i - 1;
    }
}
