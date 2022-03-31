package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName IsPerfectSquare
 * @Description https://leetcode-cn.com/problems/valid-perfect-square/
 * @Author 张淳
 * @Date 2021/11/4 13:13
 * @Version 1.0.0
 **/
public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}