package pers.jojo.leetcode.problems;

/**
 * @ClassName IsSelfCrossing
 * @Description https://leetcode-cn.com/problems/self-crossing/
 * @Author 张淳
 * @Date 2021/10/29 09:17
 * @Version 1.0.0
 **/
public class IsSelfCrossing {
    public boolean isSelfCrossing(int[] distance) {
        if (distance.length < 4) {
            return false;
        }
        for (int i = 3; i < distance.length; i++) {
            if (cross4(distance[i - 3], distance[i - 2], distance[i - 1], distance[i])) {
                return true;
            }
        }
        for (int i = 5; i < distance.length; i++) {
            if (cross6(distance[i - 5], distance[i - 4], distance[i - 3], distance[i - 2], distance[i - 1], distance[i])) {
                return true;
            }
        }
        if (distance.length == 5) {
            if (distance[1] == distance[3]) {
                return distance[0] + distance[4] >= distance[2];
            }
        }
        return false;
    }

    private boolean cross4(int a, int b, int c, int d) {
        return a >= c && b <= d;
    }

    private boolean cross6(int a, int b, int c, int d, int e, int f) {
        return c > a && d > b && e >= c - a && e <= c && f >= d - b;
    }

}