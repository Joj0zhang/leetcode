package pers.jojo.leetcode.problems.d202205;

import java.util.Arrays;

/**
 * MinMoves2
 *
 * @author 张淳
 * @date 2022/5/19 1:04
 * @description https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-ii/
 */
public class MinMoves2 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int sum = 0;
        for (int num : nums) {
            sum += Math.abs(num - mid);
        }
        return sum;
    }
}
