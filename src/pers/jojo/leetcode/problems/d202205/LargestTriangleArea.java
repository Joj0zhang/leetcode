package pers.jojo.leetcode.problems.d202205;

/**
 * LargestTriangleArea
 *
 * @author 张淳
 * @date 2022/5/15 19:46
 * @description https://leetcode.cn/problems/largest-triangle-area/
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    max = Math.max(max, area(points[i], points[j], points[k]));
                }
            }
        }
        return max;
    }

    private double area(int[] point1, int[] point2, int[] point3) {
        return Math.abs(point1[0] * (point2[1] - point3[1]) + point2[0] * (point3[1] - point1[1]) + point3[0] * (point1[1] - point2[1])) / 2.0;
    }
}
