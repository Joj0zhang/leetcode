package pers.jojo.leetcode.problems.b202202;

/**
 * IsOneBitCharacter
 *
 * @author 张淳
 * @date 2022/2/20 10:46
 * @description https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/
 */
public class IsOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        boolean res = true;
        int l = bits.length;
        for (int i = l - 2; i >= 0; i--) {
            if (bits[i] == 1) {
                res = !res;
            } else {
                break;
            }
        }
        return res;
    }
}
