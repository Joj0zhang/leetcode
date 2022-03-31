package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName IsUnique
 * @Description https://leetcode-cn.com/problems/is-unique-lcci/
 * @Author 张淳
 * @Date 2021/10/26 15:23
 * @Version 1.0.0
 **/
public class IsUnique {
    public boolean isUnique(String astr) {
        for (char c : astr.toCharArray()) {
            if (astr.indexOf(c) != astr.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
}