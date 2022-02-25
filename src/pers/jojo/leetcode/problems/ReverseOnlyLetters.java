package pers.jojo.leetcode.problems;

/**
 * ReverseOnlyLetters
 *
 * @author 张淳
 * @date 2022/2/23 9:14
 * @description https://leetcode-cn.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            if (isLetter(chars[i]) && isLetter(chars[j])) {
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
                i++;
                j--;
            } else {
                if (!isLetter(chars[i])) {
                    i++;
                }
                if (!isLetter(chars[j])) {
                    j--;
                }
            }
        }
        return String.valueOf(chars);
    }

    private boolean isLetter(char c) {
        return ((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122);
    }
}
