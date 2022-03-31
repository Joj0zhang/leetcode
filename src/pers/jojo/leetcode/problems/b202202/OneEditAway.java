package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName OneEditAway
 * @Description https://leetcode-cn.com/problems/one-away-lcci/
 * @Author 张淳
 * @Date 2021/10/26 15:24
 * @Version 1.0.0
 **/
public class OneEditAway {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        int x = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                x++;
            } else {
                break;
            }
        }
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            if (first.charAt(first.length() - 1 - i) == second.charAt(second.length() - 1 - i)) {
                x++;
            } else {
                break;
            }
        }
        return Math.min(first.length(), second.length()) - x + Math.abs(first.length() - second.length()) < 2;
    }
}