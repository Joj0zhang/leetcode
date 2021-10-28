package pers.jojo.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ReorderedPowerOf2
 * @Description https://leetcode-cn.com/problems/reordered-power-of-2/
 * @Author 张淳
 * @Date 2021/10/28 13:32
 * @Version 1.0.0
 **/
public class ReorderedPowerOf2 {
    private List<String> list = new ArrayList<>(Arrays.asList("1", "2", "4", "8", "16", "32", "64", "128", "256", "512", "1024", "2048", "4096", "8192", "16384", "32768", "65536", "131072", "262144", "524288", "1048576", "2097152", "4194304", "8388608", "16777216", "33554432", "67108864", "134217728", "268435456", "536870912"));

    public boolean reorderedPowerOf2(int n) {
        String s = n + "";
        char[] c = s.toCharArray();
        if (c.length == 1) {
            return list.contains(n + "");
        }
        try {
            perum(c, 1, c.length - 1);
            for (int i = 1; i < c.length; i++) {
                if (c[i] != '0') {
                    swap(c, 0, i);
                    // 把剩下的元素都做全排列。
                    perum(c, 1, c.length - 1);
                    // 然后再交换回去，数组还原，保证下一次不会有重复交换。
                    swap(c, i, 0);
                }
            }
        } catch (Exception e) {
            return true;
        }


        return false;
    }

    private void pringArray(char[] arr, int n) throws Exception {
        StringBuilder builder = new StringBuilder();
        for (char anArr : arr) {
            builder.append(anArr);
        }
        if (list.contains(builder.toString())) {
            throw new Exception();
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void perum(char[] arr, int p, int q) throws Exception {
        if (p == q) {
            pringArray(arr, q + 1);
        }
        for (int i = p; i <= q; i++) {
            swap(arr, i, p);
            perum(arr, p + 1, q);
            swap(arr, i, p);
        }
    }
}