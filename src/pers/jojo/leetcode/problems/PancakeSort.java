package pers.jojo.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * PancakeSort
 *
 * @author 张淳
 * @date 2022/2/19 17:01
 * @description https://leetcode-cn.com/problems/pancake-sorting/
 */
public class PancakeSort {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[0] == i + 1) {
                arr = ps(arr, i + 1);
                res.add(i + 1);
            } else {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] == i + 1) {
                        arr = ps(arr, j + 1);
                        arr = ps(arr, i + 1);
                        res.add(j + 1);
                        res.add(i + 1);
                        break;
                    }
                }
            }
        }
        return res;
    }

    private int[] ps(int[] arr, int k) {
        for (int i = 0; i < k / 2; i++) {
            int t = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = t;
        }
        return arr;
    }

}
