package pers.jojo.leetcode.problems.b202202;

import java.util.Arrays;

/**
 * MinimumDifference
 *
 * @author 张淳
 * @date 2022/2/11 14:48
 * @description https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */
public class MinimumDifference {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int r = Integer.MAX_VALUE;
        for (int i = 0, j = k - 1; j < nums.length; ) {
            r = Math.min(r, nums[j++] - nums[i++]);
        }
        return r;
    }
}
