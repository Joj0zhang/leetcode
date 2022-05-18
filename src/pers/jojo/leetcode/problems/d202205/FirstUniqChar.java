package pers.jojo.leetcode.problems.d202205;

/**
 * FirstUniqChar
 *
 * @author 张淳
 * @date 2022/5/14 21:04
 * @description https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (count[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }
}
