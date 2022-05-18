package pers.jojo.leetcode.problems.d202205;

/**
 * FindRepeatNumber
 *
 * @author 张淳
 * @date 2022/5/13 21:58
 * @description https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int[] count = new int[nums.length];
        for (int num : nums) {
            count[num]++;
            if (count[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}
