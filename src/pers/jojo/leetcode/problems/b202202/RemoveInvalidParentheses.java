package pers.jojo.leetcode.problems.b202202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName RemoveInvalidParentheses
 * @Description https://leetcode-cn.com/problems/remove-invalid-parentheses/
 * @Author 张淳
 * @Date 2021/10/27 15:21
 * @Version 1.0.0
 **/
public class RemoveInvalidParentheses {
    private HashSet<String> set = new HashSet<>();
    private int n, max, l;
    private String s;
    private int lefte = 0;
    private int righte = 0;

    public List<String> removeInvalidParentheses(String _s) {
        s = _s;
        n = s.length();
        int left = 0;
        int right = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
                lefte++;
            } else if (c == ')') {
                right++;
                if (lefte > 0) {
                    lefte--;
                } else {
                    righte++;
                }
            }
        }
        if (lefte == 0 && righte == 0) {
            return Arrays.asList(s);
        }
        l = n - lefte - righte;
        max = Math.min(left, right);
        dfs(0, "", 0);
        return new ArrayList<>(set);
    }

    void dfs(int u, String cur, int score) {
        if (score < 0 || score > max) {
            return;
        }
        if (u == n) {
            if (score == 0 && cur.length() == l) {
                set.add(cur);
            }
            return;
        }
        char c = s.charAt(u);
        if (c == '(') {
            dfs(u + 1, cur + String.valueOf(c), score + 1);
            if (lefte != 0) {
                dfs(u + 1, cur, score);
            }
        } else if (c == ')') {
            dfs(u + 1, cur + String.valueOf(c), score - 1);
            if (righte != 0) {
                dfs(u + 1, cur, score);
            }
        } else {
            dfs(u + 1, cur + String.valueOf(c), score);
        }
    }

}