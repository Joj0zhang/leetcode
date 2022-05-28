package pers.jojo.leetcode.problems.d202205;

/**
 * RemoveOuterParentheses
 *
 * @author 张淳
 * @date 2022/5/28 22:59
 * @description https://leetcode.cn/problems/remove-outermost-parentheses/
 */
public class RemoveOuterParentheses {
    public String removeOuterParentheses(String s) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                if (count > 1) {
                    sb.append(s.charAt(i));
                }
            }
            if (s.charAt(i) == ')') {
                count--;
                if (count > 0) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
