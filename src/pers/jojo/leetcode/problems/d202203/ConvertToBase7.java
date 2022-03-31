package pers.jojo.leetcode.problems.d202203;

/**
 * ConvertToBase7
 *
 * @author 张淳
 * @date 2022/3/7 16:14
 * @description https://leetcode-cn.com/problems/base-7/
 */
public class ConvertToBase7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        } else if (num > 0) {
            return convert(num);
        } else {
            return "-" + convert(-num);
        }

    }

    public String convert(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = num; i > 0; i = i / 7) {
            stringBuilder.append(i % 7);
        }
        return stringBuilder.reverse().toString();
    }

}
