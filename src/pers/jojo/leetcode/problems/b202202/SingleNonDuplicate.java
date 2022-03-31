package pers.jojo.leetcode.problems.b202202;

import java.util.Arrays;

/**
 * SingleNonDuplicate
 *
 * @author 张淳
 * @date 2022/2/14 14:55
 * @description https://leetcode-cn.com/problems/single-element-in-a-sorted-array/
 */
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 2; ) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }
        return nums[l - 1];
    }
}
