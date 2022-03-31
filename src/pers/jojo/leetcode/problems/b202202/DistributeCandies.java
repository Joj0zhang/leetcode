package pers.jojo.leetcode.problems.b202202;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName DistributeCandies
 * @Description https://leetcode-cn.com/problems/distribute-candies/
 * @Author 张淳
 * @Date 2021/11/1 09:36
 * @Version 1.0.0
 **/
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set set = new HashSet();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}