package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName IsMatch
 * @Description https://leetcode-cn.com/problems/regular-expression-matching/
 * @Author 张淳
 * @Date 2021/12/15 15:10
 * @Version 1.0.0
 **/
public class IsMatch {
    public boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}