package pers.jojo.leetcode.problems.d202205;

/**
 * NumSubarrayProductLessThanK
 *
 * @author 张淳
 * @date 2022/5/5 15:46
 * @description https://leetcode-cn.com/problems/subarray-product-less-than-k/
 */
public class NumSubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0, left = 0, right = 0, product = 1;
        while (right < nums.length) {
            product *= nums[right];
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }
            ans += right - left + 1;
            right++;
        }
        return ans;
    }
}
