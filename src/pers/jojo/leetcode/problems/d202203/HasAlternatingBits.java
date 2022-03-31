package pers.jojo.leetcode.problems.d202203;

/**
 * HasAlternatingBits
 *
 * @author 张淳
 * @date 2022/3/28 15:33
 * @description https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 */
public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int m = n ^ (n >> 1);
        return (m & (m + 1)) == 0;
    }
}
