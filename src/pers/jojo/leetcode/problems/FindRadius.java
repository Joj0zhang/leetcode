package pers.jojo.leetcode.problems;

/**
 * @ClassName FindRadius
 * @Description https://leetcode-cn.com/problems/heaters/
 * @Author 张淳
 * @Date 2021/12/20 10:09
 * @Version 1.0.0
 **/
public class FindRadius {
    public int findRadius(int[] houses, int[] heaters) {
        int result = 0;
        for (int house : houses) {
            int r = Integer.MAX_VALUE;
            for (int heater : heaters) {
                r = Math.min(r, Math.abs(house - heater));
            }
            result = Math.max(result, r);
        }
        return result;
    }
}