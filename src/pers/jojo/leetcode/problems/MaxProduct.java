package pers.jojo.leetcode.problems;

/**
 * @ClassName MaxProduct
 * @Description https://leetcode-cn.com/problems/maximum-product-of-word-lengths/
 * @Author 张淳
 * @Date 2021/11/17 14:57
 * @Version 1.0.0
 **/
public class MaxProduct {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] hash = new int[n];
        int max = 0;
        for (int i = 0; i < n; ++i) {
            for (char c : words[i].toCharArray())
                hash[i] |= 1 << (c - 'a');
        }
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((hash[i] & hash[j]) == 0)
                    max = Math.max(words[i].length() * words[j].length(), max);
            }
        }
        return max;
    }
}