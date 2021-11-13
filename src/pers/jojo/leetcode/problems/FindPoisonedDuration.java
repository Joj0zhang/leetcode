package pers.jojo.leetcode.problems;

/**
 * @ClassName FindPoisonedDuration
 * @Description https://leetcode-cn.com/problems/teemo-attacking/
 * @Author 张淳
 * @Date 2021/11/10 16:17
 * @Version 1.0.0
 **/
public class FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            result += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return result;
    }
}