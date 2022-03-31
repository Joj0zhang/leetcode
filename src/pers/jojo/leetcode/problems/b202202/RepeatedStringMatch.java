package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName RepeatedStringMatch
 * @Description https://leetcode-cn.com/problems/repeated-string-match/
 * @Author 张淳
 * @Date 2021/12/22 11:05
 * @Version 1.0.0
 **/
public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        int r = 1;
        String s = a;
        if (a.contains(b)) {
            return r;
        }
        while (a.length() - s.length() < b.length()) {
            r++;
            a = a + s;
            if (a.contains(b)) {
                return r;
            }
        }
        return -1;
    }
}