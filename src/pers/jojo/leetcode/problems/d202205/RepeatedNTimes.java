package pers.jojo.leetcode.problems.d202205;

/**
 * RepeatedNTimes
 *
 * @author 张淳
 * @date 2022/5/21 19:01
 * @description https://leetcode.cn/problems/n-repeated-element-in-size-2n-array/
 */
public class RepeatedNTimes {
    public int repeatedNTimes(int[] nums) {
        int[] count = new int[10001];
        for (int num : nums) {
            count[num]++;
            if (count[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}
