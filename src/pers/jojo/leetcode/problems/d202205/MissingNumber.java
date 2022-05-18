package pers.jojo.leetcode.problems.d202205;

/**
 * MissingNumber
 *
 * @author 张淳
 * @date 2022/5/13 22:16
 * @description https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (true) {
            mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (left > right) {
                return left;
            }
        }
    }
}
