package pers.jojo.leetcode.problems.d202203;

/**
 * ImageSmoother
 *
 * @author 张淳
 * @date 2022/3/24 16:01
 * @description https://leetcode-cn.com/problems/image-smoother/
 */
public class ImageSmoother {
    int[][] img;
    int[][] choices = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    int m;
    int n;

    public int[][] imageSmoother(int[][] _img) {
        m = _img.length;
        n = _img[0].length;
        img = _img;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = f(i, j);
            }
        }
        return res;
    }

    private int f(int i, int j) {
        int count = 0;
        int sum = 0;
        for (int[] choice : choices) {
            int ni = i + choice[0];
            int nj = j + choice[1];
            if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                count++;
                sum += img[ni][nj];
            }
        }
        return (int) Math.floor(sum / count);
    }

}
