package pers.jojo.leetcode.problems.d202205;

/**
 * DiStringMatch
 *
 * @author 张淳
 * @date 2022/5/9 0:32
 * @description https://leetcode-cn.com/problems/di-string-match/
 */
public class DiStringMatch {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int left = 0;
        int right = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                res[i] = left;
                left++;
            } else {
                res[i] = right;
                right--;
            }
        }
        res[s.length()] = left;
        return res;
    }
}
