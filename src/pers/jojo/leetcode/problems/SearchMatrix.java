package pers.jojo.leetcode.problems;

/**
 * @ClassName SearchMatrix
 * @Description https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 * @Author 张淳
 * @Date 2021/10/28 15:42
 * @Version 1.0.0
 **/
public class SearchMatrix {
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