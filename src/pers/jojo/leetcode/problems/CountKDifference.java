package pers.jojo.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * CountKDifference
 *
 * @author 张淳
 * @date 2022/2/9 13:49
 * @description https://leetcode-cn.com/problems/count-number-of-pairs-with-absolute-difference-k/
 */
public class CountKDifference {
    public int countKDifference(int[] nums, int k) {
        int res = 0, n = nums.length;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int j = 0; j < n; ++j) {
            res += cnt.getOrDefault(nums[j] - k, 0) + cnt.getOrDefault(nums[j] + k, 0);
            cnt.put(nums[j], cnt.getOrDefault(nums[j], 0) + 1);
        }
        return res;
    }
}
