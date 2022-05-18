package pers.jojo.leetcode.problems.d202205;

import java.util.Arrays;

/**
 * ReorderLogFiles
 *
 * @author 张淳
 * @date 2022/5/3 0:01
 * @description https://leetcode-cn.com/problems/reorder-data-in-log-files/
 */
public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        int length = logs.length;
        String[] result = new String[length];
        int left = 0;
        int right = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            boolean isDigit = Character.isDigit(logs[i].split(" ", 2)[1].charAt(0));
            if (isDigit) {
                result[right--] = logs[i];
            } else {
                result[left++] = logs[i];
            }
        }
        Arrays.sort(result, 0, left, this::logCompare);
        return result;
    }

    public int logCompare(String log1, String log2) {
        String[] split1 = log1.split(" ", 2);
        String[] split2 = log2.split(" ", 2);
        int sc = split1[1].compareTo(split2[1]);
        if (sc != 0) {
            return sc;
        } else {
            return split1[0].compareTo(split2[0]);
        }
    }
}
