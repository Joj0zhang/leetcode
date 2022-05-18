package pers.jojo.leetcode.problems.d202205;

import java.util.Arrays;

/**
 * MinArray
 *
 * @author 张淳
 * @date 2022/5/14 21:01
 * @description https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class MinArray {
    public int minArray(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }
}
