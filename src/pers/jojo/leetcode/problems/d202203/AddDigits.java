package pers.jojo.leetcode.problems.d202203;

/**
 * AddDigits
 *
 * @author 张淳
 * @date 2022/3/3 11:00
 * @description https://leetcode-cn.com/problems/add-digits/
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 9 == 0 ? 9 : num % 9;
        }
    }
}
