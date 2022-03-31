package pers.jojo.leetcode.problems.d202203;

import java.util.ArrayList;
import java.util.List;

/**
 * FindRestaurant
 *
 * @author 张淳
 * @date 2022/3/14 13:44
 * @description https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 */
public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<String>();
        int l1 = list1.length;
        int l2 = list2.length;
        for (int i = 0; i < l1 + l2 - 1; i++) {
            for (int m = Math.max(0, i - l2 + 1), n = i - m; m < l1 && n >= 0; m++, n--) {
                if (list1[m].equals(list2[n])) {
                    res.add(list1[m]);
                }
            }
            if (!res.isEmpty()) {
                return res.toArray(new String[res.size()]);
            }
        }
        return new String[0];
    }
}
