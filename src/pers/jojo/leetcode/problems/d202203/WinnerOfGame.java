package pers.jojo.leetcode.problems.d202203;

/**
 * WinnerOfGame
 *
 * @author 张淳
 * @date 2022/3/22 11:00
 * @description https://leetcode-cn.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
 */
public class WinnerOfGame {
    public boolean winnerOfGame(String colors) {
        int a = 0;
        int b = 0;
        char[] chars = colors.toCharArray();
        char x = chars[0];
        int count = 0;
        for (char c : chars) {
            if (x == c) {
                count++;
                if (count > 2) {
                    if ('A' == c) {
                        a++;
                    } else {
                        b++;
                    }
                }
            } else {
                count = 1;
                x = c;
            }
        }
        return a > b;
    }
}
