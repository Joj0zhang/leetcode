package pers.jojo.leetcode.problems.b202202;

/**
 * PushDominoes
 *
 * @author 张淳
 * @date 2022/2/21 10:03
 * @description https://leetcode-cn.com/problems/push-dominoes/
 */
public class PushDominoes {
    public String pushDominoes(String dominoes) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = dominoes.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('.' == chars[i]) {
                int l = Integer.MAX_VALUE;
                int r = Integer.MAX_VALUE;
                for (int j = 1; i - j >= 0; j++) {
                    if (chars[i - j] == 'R') {
                        l = j;
                        break;
                    } else if (chars[i - j] == 'L') {
                        break;
                    }
                }
                for (int j = 1; i + j < chars.length; j++) {
                    if (chars[i + j] == 'L') {
                        r = j;
                        break;
                    } else if (chars[i + j] == 'R') {
                        break;
                    }
                }
                if (l < r) {
                    stringBuilder.append('R');
                } else if (l > r) {
                    stringBuilder.append('L');
                } else {
                    stringBuilder.append('.');
                }
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
