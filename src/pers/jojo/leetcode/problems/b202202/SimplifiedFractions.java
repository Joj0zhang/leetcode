package pers.jojo.leetcode.problems.b202202;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * SimplifiedFractions
 * @author 张淳
 * @date 2022/2/10 15:35
 * @description https://leetcode-cn.com/problems/simplified-fractions/
 */
public class SimplifiedFractions {
    public List<String> simplifiedFractions(int n) {
        Set<String> set = simplified(n);
        return new ArrayList<>(set);
    }

    public Set<String> simplified(int n) {
        if (n <= 1) return new HashSet<>();
        else {
            Set<String> set = simplified(n - 1);
            for (int i = 1; i < n; i++) {
                int x = gcd(i, n);
                set.add(i / x + "/" + n / x);
            }
            return set;
        }
    }

    public int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
