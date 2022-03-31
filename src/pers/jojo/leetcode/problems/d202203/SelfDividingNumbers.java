package pers.jojo.leetcode.problems.d202203;

import java.util.ArrayList;
import java.util.List;

/**
 * SelfDividingNumbers
 *
 * @author 张淳
 * @date 2022/3/31 10:27
 * @description https://leetcode-cn.com/problems/self-dividing-numbers/
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
