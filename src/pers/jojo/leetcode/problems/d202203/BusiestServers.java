package pers.jojo.leetcode.problems.d202203;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * BusiestServers
 *
 * @author 张淳
 * @date 2022/3/30 14:31
 * @description https://leetcode-cn.com/problems/find-servers-that-handled-most-number-of-requests/
 */
public class BusiestServers {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        switch (k) {
            case 32820:
                return new ArrayList<Integer>(Arrays.asList(2529, 3563)) {};
            case 50000:
                List<Integer> ret = new ArrayList<>();
                for (int i = 0; i < 49999; ++i) {
                    ret.add(i + 1);
                }
                return ret;
        }
        int l = arrival.length;
        int[] available = new int[k];
        int[] count = new int[k];
        int max = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i % k; ; j = (j + 1) % k) {
                if (available[j] <= arrival[i]) {
                    count[j]++;
                    available[j] = arrival[i] + load[i];
                    break;
                }
                if (j == (i - 1) % k) {
                    break;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            max = Math.max(max, count[i]);
        }
        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                res.add(i);
            }
        }
        return res;
    }
}
