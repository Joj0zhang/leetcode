package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName Rotate
 * @Description https://leetcode-cn.com/problems/rotate-matrix-lcci/
 * @Author 张淳
 * @Date 2021/10/26 15:26
 * @Version 1.0.0
 **/
public class Rotate {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][matrix.length - i - 1];
                matrix[matrix.length - j - 1][matrix.length - i - 1] = temp;
            }
        }
        for (int i = 0; i < (matrix.length / 2); i++) {
            for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = temp;
            }
        }
    }
}