package pers.jojo.leetcode.problems.d202205;

/**
 * FindNumberIn2DArray
 *
 * @author 张淳
 * @date 2022/5/14 20:52
 * @description https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class FindNumberIn2DArray {
    private int xx;
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        xx = matrix.length;
        return check(matrix, target, 0, matrix[0].length - 1);
    }

    boolean check(int[][] matrix, int target, int x, int y) {
        if (target == matrix[x][y]) {
            return true;
        } else if (target > matrix[x][y]) {
            if (x == xx - 1) {
                return false;
            }
            return check(matrix, target, x + 1, y);
        } else {
            if (y == 0) {
                return false;
            }
            return check(matrix, target, x, y - 1);
        }
    }
}
