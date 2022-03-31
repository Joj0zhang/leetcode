package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName ConstructRectangle
 * @Description https://leetcode-cn.com/problems/construct-the-rectangle/
 * @Author 张淳
 * @Date 2021/10/28 17:09
 * @Version 1.0.0
 **/
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        for (int i = (int) Math.sqrt(area); ; i--) {
            if (area % i == 0) return new int[]{area / i, i};
        }
    }
}