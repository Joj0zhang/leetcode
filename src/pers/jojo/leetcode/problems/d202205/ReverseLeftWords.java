package pers.jojo.leetcode.problems.d202205;

/**
 * ReverseLeftWords
 *
 * @author 张淳
 * @date 2022/5/13 21:55
 * @description https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
