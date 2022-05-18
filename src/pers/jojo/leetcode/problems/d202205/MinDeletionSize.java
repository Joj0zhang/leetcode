package pers.jojo.leetcode.problems.d202205;

/**
 * MinDeletionSize
 *
 * @author 张淳
 * @date 2022/5/12 0:29
 * @description https://leetcode.cn/problems/delete-columns-to-make-sorted/
 */
public class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int min = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < c) {
                    min++;
                    break;
                }
                c = strs[j].charAt(i);
            }
        }
        return min;
    }
}
