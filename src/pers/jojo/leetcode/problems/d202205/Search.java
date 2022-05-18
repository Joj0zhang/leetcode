package pers.jojo.leetcode.problems.d202205;

/**
 * Search
 *
 * @author 张淳
 * @date 2022/5/13 22:03
 * @description https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */
public class Search {
    //target在数组中出现的次数
    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
