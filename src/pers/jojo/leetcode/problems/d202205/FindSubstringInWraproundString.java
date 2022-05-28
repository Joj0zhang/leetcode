package pers.jojo.leetcode.problems.d202205;

import java.util.Arrays;

/**
 * FindSubstringInWraproundString
 *
 * @author 张淳
 * @date 2022/5/25 9:50
 * @description https://leetcode.cn/problems/unique-substrings-in-wraparound-string/
 */
public class FindSubstringInWraproundString {

    public int findSubstringInWraproundString(String p) {
        int[] count = new int[26];
        int max = 0;
        for (int i = 0; i < p.length(); i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) + 26) % 26 == 1) {
                max++;
            } else {
                max = 1;
            }
            count[p.charAt(i) - 'a'] = Math.max(count[p.charAt(i) - 'a'], max);
        }

        return Arrays.stream(count).sum();
    }

}
