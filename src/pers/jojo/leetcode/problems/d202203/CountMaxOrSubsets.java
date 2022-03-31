package pers.jojo.leetcode.problems.d202203;

/**
 * CountMaxOrSubsets
 *
 * @author 张淳
 * @date 2022/3/15 13:22
 * @description https://leetcode-cn.com/problems/count-number-of-maximum-bitwise-or-subsets/
 */
public class CountMaxOrSubsets {
    int max = 0;
    int l = 0;
    int res = 0;
    int[] nums_;

    public int countMaxOrSubsets(int[] nums) {
        nums_ = nums;
        for (int i : nums) {
            max |= i;
        }
        l = nums.length;
        dfs(0, 0);
        return res;
    }

    void dfs(int x, int now) {
        if (x == l) {
            if (now == max) {
                res++;
            }
        } else {
            dfs(x + 1, now);
            now = now | nums_[x];
            dfs(x + 1, now);
        }
    }
}
