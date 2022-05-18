package pers.jojo.leetcode.problems.d202205;

import java.util.ArrayList;
import java.util.List;

/**
 * FindDuplicates
 *
 * @author 张淳
 * @date 2022/5/8 10:14
 * @description https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
 */
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        //获取num中重复的元素
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                list.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}
