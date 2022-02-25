package pers.jojo.leetcode.problems;

/**
 * LongestPalindrome
 *
 * @author 张淳
 * @date 2022/2/25 11:01
 * @description https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int len = 1;
        int begin = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; i - j >= 0 && i + j < chars.length; j++) {
                if (chars[i - j] == chars[i + j]) {
                    int l = 2 * j + 1;
                    if (l > len) {
                        begin = i - j;
                        len = l;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i + 1 < chars.length; i++) {
            for (int j = 0; i - j >= 0 && i + 1 + j < chars.length; j++) {
                if (chars[i - j] == chars[i + 1 + j]) {
                    int l = 2 * j + 2;
                    if (l > len) {
                        begin = i - j;
                        len = l;
                    }
                } else {
                    break;
                }
            }
        }
        return s.substring(begin, begin + len);
    }
}
